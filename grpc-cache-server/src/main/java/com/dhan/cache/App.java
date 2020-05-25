package com.dhan.cache;


import io.grpc.Server;
import io.grpc.ServerBuilder;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        // Create a new server to listen on port 8080
        Server server = ServerBuilder.forPort(8080)
                .addService(new CacheServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}