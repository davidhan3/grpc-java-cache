package com.dhan.cache;

import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;

import io.grpc.testing.GrpcCleanupRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class CacheServiceImplTest {

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    private CacheServiceGrpc.CacheServiceBlockingStub stub;

    @Before
    public void setup() throws Exception {
        String serverName = InProcessServerBuilder.generateName();

        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new CacheServiceImpl()).build().start());

        stub = CacheServiceGrpc.newBlockingStub(
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));
    }

    @Test
    public void testPing() throws Exception {
        PingResponse response = stub.ping(PingRequest.newBuilder()
                                                     .setMessage("Ping")
                                                     .build());

        System.out.println(response);

        assertEquals("Pong: [Ping]", response.getMessage());
    }

    @Test
    public void testPutThenGet() throws Exception {
        PutValueResponse putResponse = stub.putValue(PutValueRequest.newBuilder()
                                                                    .setKey("Foo")
                                                                    .setValue("Bar")
                                                                    .build());

        System.out.println("Put Value response: :" + putResponse);

        assertTrue(putResponse.getResponse());

        GetValueResponse getResponse = stub.getValue(GetValueRequest.newBuilder().setKey("Foo").build());

        System.out.println("Get Value response: "+ getResponse);

        assertEquals("Bar", getResponse.getValue());
    }
}
