package com.dhan.cache;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client
{
    private static final Logger logger = LogManager.getLogger(Client.class);

    public static void main( String[] args ) throws Exception
    {
        String serverUrl = System.getenv("GRPC_SERVER_URL") != null ? System.getenv("GRPC_SERVER_URL") : "localhost:8080";

        Command command = CommandOperation.getOperation(args);
        if(command == Command.INVALID){
            logger.error("Invalid command received");
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