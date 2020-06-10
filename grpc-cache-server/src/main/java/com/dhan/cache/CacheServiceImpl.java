package com.dhan.cache;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CacheServiceImpl extends CacheServiceGrpc.CacheServiceImplBase{
    private static final Logger logger = LogManager.getLogger(CacheServiceImpl.class);

    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        logger.info("Ping Request received: "+request);
        responseObserver.onNext(ping(request));
        responseObserver.onCompleted();
    }

    @Override
    public void putValue(PutValueRequest request, StreamObserver<PutValueResponse> responseObserver) {
        logger.info("Put Request received: "+request);
        responseObserver.onNext(putValue(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getValue(GetValueRequest request, StreamObserver<GetValueResponse> responseObserver) {
        logger.info("Get Request received: "+request);

        String val = getValue(request);

        if(val == null){
            responseObserver.onError(Status.INVALID_ARGUMENT
                                            .withDescription("Key doesn't exist")
                                            .asRuntimeException());
        } else{
            responseObserver.onNext(GetValueResponse.newBuilder()
                                                    .setValue(val)
                                                    .build());
            responseObserver.onCompleted();
        }

    }

    @Override
    public void getKeys(GetKeysRequest request, StreamObserver<GetKeysResponse> responseObserver) {
        logger.info("Get Keys Request recieved");
        responseObserver.onNext(GetKeysResponse.newBuilder().addAllKeys(Cache.getInstance().getKeys()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteValue(DeleteValueRequest request, StreamObserver<DeleteValueResponse> responseObserver) {
        logger.info("Delete Request received: " + request);
        responseObserver.onNext(deleteValue(request));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteAllValues(DeleteAllValuesRequest request, StreamObserver<DeleteAllValuesResponse> responseObserver) {
        logger.info("Delete All Request received");
        responseObserver.onNext(deleteAllValues());
        responseObserver.onCompleted();
    }

    private PingResponse ping(PingRequest request) {
        PingResponse.Builder response = PingResponse.newBuilder();
        response.setMessage("Pong: ["+request.getMessage()+"]");
        return response.build();
    }

    private String getValue(GetValueRequest request) {
        return Cache.getInstance().get(request.getKey());
    }

    private PutValueResponse putValue(PutValueRequest request) {
        boolean val = Cache.getInstance().put(request.getKey(), request.getValue());

        return PutValueResponse.newBuilder()
                               .setResponse(val)
                               .build();
    }

    private DeleteValueResponse deleteValue(DeleteValueRequest request) {
        boolean val = Cache.getInstance().delete(request.getKey());

        return DeleteValueResponse.newBuilder()
                                  .setResponse(val)
                                  .build();
    }

    private DeleteAllValuesResponse deleteAllValues(){
        boolean val = Cache.getInstance().deleteAll();

        return DeleteAllValuesResponse.newBuilder()
                                      .setResponse(val)
                                      .build();
    }
}