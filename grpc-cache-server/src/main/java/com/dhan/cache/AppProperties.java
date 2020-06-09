package com.dhan.cache;

import java.util.Properties;

public class AppProperties {

    public static Properties readProperties() throws Exception{
        Properties prop = new Properties();
        prop.load(AppProperties.class.getResourceAsStream("/config.properties"));

        if(System.getenv("GRPC_CACHE_SERVER_PORT") != null){
            prop.put("port", readInt("GRPC_CACHE_SERVER_PORT"));
        }

        return prop;
    }

    private static Integer readInt(String var) throws Exception{
        try{
            return Integer.parseInt(System.getenv(var));
        } catch (Exception e){
            throw new Exception("Error reading integer environment variable ["+var+
                    "], expected valid int, got ["+System.getenv(var)+"]");
        }
    }
}
