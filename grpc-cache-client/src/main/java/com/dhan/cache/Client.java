package com.dhan.cache;

import io.grpc.*;

public class Client
{
    public static void main( String[] args ) throws Exception
    {
        Command command = getOperation(args[0]);
        if(command == Command.INVALID){
            System.out.println("Invalid command received");
            System.exit(1);
        }
        // Channel is the abstraction to connect to a service endpoint, plaintext because no SSL
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080").usePlaintext().build();
        CacheServiceGrpc.CacheServiceBlockingStub stub = CacheServiceGrpc.newBlockingStub(channel);
        CacheClient cache = new CacheClient(channel, stub);

        cache.operation(command, args);

        channel.shutdownNow();
    }

    //Move this to the command class itself
    private static Command getOperation(String argument){
        Command c;
        switch(argument.toLowerCase()){
            case "ping":
                c = Command.PING;
                break;
            case "get":
                c = Command.GET;
                break;
            case "put":
                c = Command.PUT;
                break;
            case "delete":
                c = Command.DELETE;
                break;
            case "deleteall":
                c = Command.DELETEALL;
                break;
            case "getkeys":
                c = Command.GETKEYS;
                break;
            default:
                c = Command.INVALID;
        }
        return c;
    }
}