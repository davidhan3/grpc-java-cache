package com.dhan.cache;

import io.grpc.*;

public class Client
{
    public static void main( String[] args ) throws Exception
    {
        // Channel is the abstraction to connect to a service endpoint
        // Let's use plaintext communication because we don't have certs
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();

        // It is up to the client to determine whether to block the call
        // Here we create a blocking stub, but an async stub,
        // or an async stub with Future are always possible.
        CacheServiceGrpc.CacheServiceBlockingStub stub = CacheServiceGrpc.newBlockingStub(channel);

        //ping(channel, stub);
        put(channel, stub);
        get(channel, stub);

        // A Channel should be shutdown before stopping the process.
        channel.shutdownNow();
    }

    private static void ping(ManagedChannel channel, CacheServiceGrpc.CacheServiceBlockingStub stub) {
        PingRequest request = PingRequest.newBuilder().setMessage("Ping").build();
        PingResponse response = stub.ping(request);
        System.out.println(response);
    }

    private static void put(ManagedChannel channel, CacheServiceGrpc.CacheServiceBlockingStub stub) {
        PutValueRequest request = PutValueRequest.newBuilder()
                                                 .setKey("Foo")
                                                 .setValue("Bar")
                                                 .build();
        PutValueResponse response = stub.putValue(request);
        System.out.println(response);
    }

    private static void get(ManagedChannel channel, CacheServiceGrpc.CacheServiceBlockingStub stub) {
        GetValueRequest request = GetValueRequest.newBuilder().setKey("Foo").build();
        GetValueResponse response = stub.getValue(request);
        System.out.println(response);
    }
}