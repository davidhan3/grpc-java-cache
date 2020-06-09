package com.dhan.cache;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class Client
{
    public static void main( String[] args ) throws Exception
    {
        String serverUrl = System.getenv("GRPC_SERVER_URL") != null ? System.getenv("GRPC_SERVER_URL") : "localhost:8080";

        Command command = CommandOperation.getOperation(args);
        if(command == Command.INVALID){
            System.out.println("Invalid command received");
            System.exit(1);
        }
        // Channel is the abstraction to connect to a service endpoint, plaintext because no SSL
        final ManagedChannel channel = ManagedChannelBuilder.forTarget(serverUrl).usePlaintext().build();
        CacheServiceGrpc.CacheServiceBlockingStub stub = CacheServiceGrpc.newBlockingStub(channel);
        CacheClient cache = new CacheClient(channel, stub);

        cache.operation(command, args);

        channel.shutdownNow();
    }
}