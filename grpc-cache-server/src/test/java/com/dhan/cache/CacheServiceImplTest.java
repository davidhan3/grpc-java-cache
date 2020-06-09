package com.dhan.cache;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;

import io.grpc.testing.GrpcCleanupRule;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CacheServiceImplTest {

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    private CacheServiceGrpc.CacheServiceBlockingStub stub;

    @Before
    public void setup() throws IOException {
        Cache.getInstance().deleteAll();
        String serverName = InProcessServerBuilder.generateName();

        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new CacheServiceImpl()).build().start());

        stub = CacheServiceGrpc.newBlockingStub(
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));
    }

    @Test
    public void ping() {
        PingResponse response = stub.ping(PingRequest.newBuilder()
                                                     .setMessage("Ping")
                                                     .build());

        System.out.println(response);

        assertEquals("Pong: [Ping]", response.getMessage());
    }

    @Test
    public void putThenGet() {
        PutValueResponse putResponse = stub.putValue(PutValueRequest.newBuilder()
                                                                    .setKey("Foo")
                                                                    .setValue("Bar")
                                                                    .build());

        System.out.println("Put Value response: :" + putResponse);

        assertTrue(putResponse.getResponse());

        GetValueResponse getResponse = stub.getValue(GetValueRequest.newBuilder()
                                                                    .setKey("Foo")
                                                                    .build());

        System.out.println("Get Value response: "+ getResponse);

        assertEquals("Bar", getResponse.getValue());
    }

    @Test
    public void getAllKeys() {
        stub.putValue(PutValueRequest.newBuilder().setKey("A").setValue("B").build());
        stub.putValue(PutValueRequest.newBuilder().setKey("B").setValue("B").build());
        stub.putValue(PutValueRequest.newBuilder().setKey("C").setValue("B").build());
        stub.putValue(PutValueRequest.newBuilder().setKey("D").setValue("B").build());
        GetKeysResponse response = stub.getKeys(GetKeysRequest.newBuilder().build());

        Set<String> keySet = new HashSet<String>(response.getKeysList());

        assertEquals(keySet.size(), 4);
        assertTrue(keySet.contains("A"));
        assertTrue(keySet.contains("B"));
        assertTrue(keySet.contains("C"));
        assertTrue(keySet.contains("D"));
    }

    @Test
    public void getNullKey() throws Exception{
        try {
            stub.getValue(GetValueRequest.newBuilder()
                                         .setKey("Foo")
                                         .build());
        } catch (StatusRuntimeException e){
            assertEquals(e.getStatus().getCode(), Status.INVALID_ARGUMENT.getCode());
            assertEquals(e.getMessage(), "INVALID_ARGUMENT: Key doesn't exist");
            return;
        }
        Assert.fail("Null key exception not caught");
    }

    @Test
    public void deleteKey() {
        stub.putValue(PutValueRequest.newBuilder().setKey("A").setValue("Val").build());
        stub.putValue(PutValueRequest.newBuilder().setKey("B").setValue("Val").build());

        stub.deleteValue(DeleteValueRequest.newBuilder().setKey("A").build());

        GetKeysResponse response = stub.getKeys(GetKeysRequest.newBuilder().build());
        Set<String> keySet = new HashSet<>(response.getKeysList());

        assertFalse(keySet.contains("A"));
        assertTrue(keySet.contains("B"));
    }

    @Test
    public void deleteAllKeys() {
        stub.putValue(PutValueRequest.newBuilder().setKey("A").setValue("Val").build());
        stub.putValue(PutValueRequest.newBuilder().setKey("B").setValue("Val").build());

        stub.deleteAllValues(DeleteAllValuesRequest.newBuilder().build());

        GetKeysResponse response = stub.getKeys(GetKeysRequest.newBuilder().build());
        Set<String> keySet = new HashSet<>(response.getKeysList());

        assertTrue(keySet.isEmpty());
    }
}
