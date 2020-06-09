package com.dhan.cache;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Properties prop = new Properties();
        try{
            prop = AppProperties.readProperties();
        } catch (Exception e){
            System.out.println("Error reading application properties, exiting: "+ e.getMessage());
            System.exit(1);
        }
        System.out.println("Starting gRPC cache server on port "+prop.get("port"));
        // Create a new server to listen on port 8080
        Server server = ServerBuilder.forPort((Integer) prop.get("port"))
                .addService(new CacheServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}