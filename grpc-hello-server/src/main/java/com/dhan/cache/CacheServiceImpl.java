package com.dhan.cache;

import io.grpc.stub.StreamObserver;

public class CacheServiceImpl extends CacheServiceGrpc.CacheServiceImplBase{
    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        System.out.println("Ping Request received: "+request);
        responseObserver.onNext(ping(request));
        responseObserver.onCompleted();
    }

    @Override
    public void putValue(PutValueRequest request, StreamObserver<PutValueResponse> responseObserver) {
        System.out.println("Put Request received: "+request);
        responseObserver.onNext(putValue(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getValue(GetValueRequest request, StreamObserver<GetValueResponse> responseObserver) {
        System.out.println("Get Request received: "+request);
        responseObserver.onNext(getValue(request));
        responseObserver.onCompleted();
    }

    private PingResponse ping(PingRequest request) {
        PingResponse.Builder response = PingResponse.newBuilder();
        response.setMessage("Pong: ["+request.getMessage()+"]");
        return response.build();
    }

    private GetValueResponse getValue(GetValueRequest request) {
        String value = Cache.getInstance().get(request.getKey());

        return GetValueResponse.newBuilder()
                .setValue(value)
                .build();
    }

    private PutValueResponse putValue(PutValueRequest request) {
        Cache.getInstance().put(request.getKey(), request.getValue());

        return PutValueResponse.newBuilder()
                .setResponse(true)
                .build();
    }
}