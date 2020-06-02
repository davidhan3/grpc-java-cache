package com.dhan.cache;

import io.grpc.ManagedChannel;
import io.grpc.Status;

import java.util.HashSet;
import java.util.Set;

public class CacheClient {

    ManagedChannel channel;
    CacheServiceGrpc.CacheServiceBlockingStub stub;

    public CacheClient(ManagedChannel c, CacheServiceGrpc.CacheServiceBlockingStub s){
        channel = c;
        stub = s;
    }

    /**
     * @param command
     * @param args
     */
    public void operation(Command command, String[] args){
        System.out.println(""+command+" command received");

        if(command.getRequiredParams() != args.length){
            System.out.println("Invalid number of params recieved. Expected: ["+command.getRequiredParams()+"], Recieved: ["+args.length+"]");
        }

        switch(command){
            case PING:
                System.out.println("Response: "+ ping());
                break;
            case GET:
                System.out.println("Response: "+ get(args[1]));
                break;
            case PUT:
                System.out.println("Response: "+ put(args[1], args[2]));
                break;
            case DELETE:
                System.out.println("Response: "+delete(args[1]));
                break;
            case DELETEALL:
                System.out.println("Response: "+deleteAll());
                break;
            case GETKEYS:
                Set<String> keys = getKeys();
                System.out.println(keys.toString());
        }
    }

    private String ping() {
        PingRequest request = PingRequest.newBuilder().setMessage("Ping").build();
        PingResponse response = stub.ping(request);
        return response.getMessage();
    }

    private boolean put(String key, String value) {
        PutValueRequest request = PutValueRequest.newBuilder()
                                                 .setKey(key)
                                                 .setValue(value)
                                                 .build();

        PutValueResponse response = stub.putValue(request);
        return response.getResponse();
    }

    private String get(String key){
        GetValueRequest request = GetValueRequest.newBuilder()
                                                 .setKey(key)
                                                 .build();
        try {
            GetValueResponse response = stub.getValue(request);
            return response.getValue();
        } catch (io.grpc.StatusRuntimeException e){
            if(e.getStatus().getCode() == Status.INVALID_ARGUMENT.getCode()
                    && e.getMessage().equals("INVALID_ARGUMENT: Key doesn't exist")){
                return null;
            } else{
                throw e;
            }
        }
    }

    private boolean delete(String key){
        DeleteValueRequest request = DeleteValueRequest.newBuilder()
                                                       .setKey(key)
                                                       .build();
        DeleteValueResponse response = stub.deleteValue(request);
        return response.getResponse();
    }

    private boolean deleteAll(){
        DeleteAllValuesRequest request = DeleteAllValuesRequest.newBuilder().build();
        DeleteAllValuesResponse response = stub.deleteAllValues(request);
        return response.getResponse();
    }

    private Set<String> getKeys(){
        GetKeysRequest request = GetKeysRequest.newBuilder().build();
        GetKeysResponse response = stub.getKeys(request);
        return new HashSet<String>(response.getKeysList());
    }
}
