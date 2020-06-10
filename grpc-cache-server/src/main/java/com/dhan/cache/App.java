package com.dhan.cache;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) throws Exception
    {
        Properties prop = new Properties();
        try{
            prop = AppProperties.readProperties();
        } catch (Exception e){
            logger.error("Error reading application properties, exiting: "+ e.getMessage());
            System.exit(1);
        }
        logger.info("Starting gRPC cache server on port "+prop.get("port"));

        // Create a new server to listen on port 8080
        Server server = ServerBuilder.forPort(Integer.parseInt(prop.getProperty("port")))
                .addService(new CacheServiceImpl())
                .build();

        server.start();
        logger.info("Server started");
        server.awaitTermination();
    }
}