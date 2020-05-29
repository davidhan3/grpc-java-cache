package com.dhan.cache;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: CacheService.proto")
public final class CacheServiceGrpc {

  private CacheServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dhan.cache.CacheService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.PingRequest,
      com.dhan.cache.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = com.dhan.cache.PingRequest.class,
      responseType = com.dhan.cache.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.PingRequest,
      com.dhan.cache.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.PingRequest, com.dhan.cache.PingResponse> getPingMethod;
    if ((getPingMethod = CacheServiceGrpc.getPingMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getPingMethod = CacheServiceGrpc.getPingMethod) == null) {
          CacheServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.PingRequest, com.dhan.cache.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.GetValueRequest,
      com.dhan.cache.GetValueResponse> getGetValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getValue",
      requestType = com.dhan.cache.GetValueRequest.class,
      responseType = com.dhan.cache.GetValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.GetValueRequest,
      com.dhan.cache.GetValueResponse> getGetValueMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.GetValueRequest, com.dhan.cache.GetValueResponse> getGetValueMethod;
    if ((getGetValueMethod = CacheServiceGrpc.getGetValueMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetValueMethod = CacheServiceGrpc.getGetValueMethod) == null) {
          CacheServiceGrpc.getGetValueMethod = getGetValueMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.GetValueRequest, com.dhan.cache.GetValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.GetValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.GetValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getValue"))
              .build();
        }
      }
    }
    return getGetValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.PutValueRequest,
      com.dhan.cache.PutValueResponse> getPutValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "putValue",
      requestType = com.dhan.cache.PutValueRequest.class,
      responseType = com.dhan.cache.PutValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.PutValueRequest,
      com.dhan.cache.PutValueResponse> getPutValueMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.PutValueRequest, com.dhan.cache.PutValueResponse> getPutValueMethod;
    if ((getPutValueMethod = CacheServiceGrpc.getPutValueMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getPutValueMethod = CacheServiceGrpc.getPutValueMethod) == null) {
          CacheServiceGrpc.getPutValueMethod = getPutValueMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.PutValueRequest, com.dhan.cache.PutValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "putValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.PutValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.PutValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("putValue"))
              .build();
        }
      }
    }
    return getPutValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.DeleteValueRequest,
      com.dhan.cache.DeleteValueResponse> getDeleteValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteValue",
      requestType = com.dhan.cache.DeleteValueRequest.class,
      responseType = com.dhan.cache.DeleteValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.DeleteValueRequest,
      com.dhan.cache.DeleteValueResponse> getDeleteValueMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.DeleteValueRequest, com.dhan.cache.DeleteValueResponse> getDeleteValueMethod;
    if ((getDeleteValueMethod = CacheServiceGrpc.getDeleteValueMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getDeleteValueMethod = CacheServiceGrpc.getDeleteValueMethod) == null) {
          CacheServiceGrpc.getDeleteValueMethod = getDeleteValueMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.DeleteValueRequest, com.dhan.cache.DeleteValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.DeleteValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.DeleteValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("deleteValue"))
              .build();
        }
      }
    }
    return getDeleteValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.DeleteAllValuesRequest,
      com.dhan.cache.DeleteAllValuesResponse> getDeleteAllValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAllValues",
      requestType = com.dhan.cache.DeleteAllValuesRequest.class,
      responseType = com.dhan.cache.DeleteAllValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.DeleteAllValuesRequest,
      com.dhan.cache.DeleteAllValuesResponse> getDeleteAllValuesMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.DeleteAllValuesRequest, com.dhan.cache.DeleteAllValuesResponse> getDeleteAllValuesMethod;
    if ((getDeleteAllValuesMethod = CacheServiceGrpc.getDeleteAllValuesMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getDeleteAllValuesMethod = CacheServiceGrpc.getDeleteAllValuesMethod) == null) {
          CacheServiceGrpc.getDeleteAllValuesMethod = getDeleteAllValuesMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.DeleteAllValuesRequest, com.dhan.cache.DeleteAllValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAllValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.DeleteAllValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.DeleteAllValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("deleteAllValues"))
              .build();
        }
      }
    }
    return getDeleteAllValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dhan.cache.GetKeysRequest,
      com.dhan.cache.GetKeysResponse> getGetKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getKeys",
      requestType = com.dhan.cache.GetKeysRequest.class,
      responseType = com.dhan.cache.GetKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dhan.cache.GetKeysRequest,
      com.dhan.cache.GetKeysResponse> getGetKeysMethod() {
    io.grpc.MethodDescriptor<com.dhan.cache.GetKeysRequest, com.dhan.cache.GetKeysResponse> getGetKeysMethod;
    if ((getGetKeysMethod = CacheServiceGrpc.getGetKeysMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetKeysMethod = CacheServiceGrpc.getGetKeysMethod) == null) {
          CacheServiceGrpc.getGetKeysMethod = getGetKeysMethod =
              io.grpc.MethodDescriptor.<com.dhan.cache.GetKeysRequest, com.dhan.cache.GetKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.GetKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dhan.cache.GetKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getKeys"))
              .build();
        }
      }
    }
    return getGetKeysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CacheServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub>() {
        @java.lang.Override
        public CacheServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceStub(channel, callOptions);
        }
      };
    return CacheServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CacheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub>() {
        @java.lang.Override
        public CacheServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceBlockingStub(channel, callOptions);
        }
      };
    return CacheServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CacheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub>() {
        @java.lang.Override
        public CacheServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceFutureStub(channel, callOptions);
        }
      };
    return CacheServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CacheServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void ping(com.dhan.cache.PingRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void getValue(com.dhan.cache.GetValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.GetValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetValueMethod(), responseObserver);
    }

    /**
     */
    public void putValue(com.dhan.cache.PutValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.PutValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutValueMethod(), responseObserver);
    }

    /**
     */
    public void deleteValue(com.dhan.cache.DeleteValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.DeleteValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteValueMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllValues(com.dhan.cache.DeleteAllValuesRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.DeleteAllValuesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAllValuesMethod(), responseObserver);
    }

    /**
     */
    public void getKeys(com.dhan.cache.GetKeysRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.GetKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeysMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.PingRequest,
                com.dhan.cache.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.GetValueRequest,
                com.dhan.cache.GetValueResponse>(
                  this, METHODID_GET_VALUE)))
          .addMethod(
            getPutValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.PutValueRequest,
                com.dhan.cache.PutValueResponse>(
                  this, METHODID_PUT_VALUE)))
          .addMethod(
            getDeleteValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.DeleteValueRequest,
                com.dhan.cache.DeleteValueResponse>(
                  this, METHODID_DELETE_VALUE)))
          .addMethod(
            getDeleteAllValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.DeleteAllValuesRequest,
                com.dhan.cache.DeleteAllValuesResponse>(
                  this, METHODID_DELETE_ALL_VALUES)))
          .addMethod(
            getGetKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dhan.cache.GetKeysRequest,
                com.dhan.cache.GetKeysResponse>(
                  this, METHODID_GET_KEYS)))
          .build();
    }
  }

  /**
   */
  public static final class CacheServiceStub extends io.grpc.stub.AbstractAsyncStub<CacheServiceStub> {
    private CacheServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void ping(com.dhan.cache.PingRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getValue(com.dhan.cache.GetValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.GetValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putValue(com.dhan.cache.PutValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.PutValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteValue(com.dhan.cache.DeleteValueRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.DeleteValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllValues(com.dhan.cache.DeleteAllValuesRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.DeleteAllValuesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAllValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKeys(com.dhan.cache.GetKeysRequest request,
        io.grpc.stub.StreamObserver<com.dhan.cache.GetKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CacheServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CacheServiceBlockingStub> {
    private CacheServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.dhan.cache.PingResponse ping(com.dhan.cache.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dhan.cache.GetValueResponse getValue(com.dhan.cache.GetValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dhan.cache.PutValueResponse putValue(com.dhan.cache.PutValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dhan.cache.DeleteValueResponse deleteValue(com.dhan.cache.DeleteValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dhan.cache.DeleteAllValuesResponse deleteAllValues(com.dhan.cache.DeleteAllValuesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAllValuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dhan.cache.GetKeysResponse getKeys(com.dhan.cache.GetKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeysMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CacheServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CacheServiceFutureStub> {
    private CacheServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.PingResponse> ping(
        com.dhan.cache.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.GetValueResponse> getValue(
        com.dhan.cache.GetValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.PutValueResponse> putValue(
        com.dhan.cache.PutValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.DeleteValueResponse> deleteValue(
        com.dhan.cache.DeleteValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.DeleteAllValuesResponse> deleteAllValues(
        com.dhan.cache.DeleteAllValuesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAllValuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhan.cache.GetKeysResponse> getKeys(
        com.dhan.cache.GetKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeysMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_VALUE = 1;
  private static final int METHODID_PUT_VALUE = 2;
  private static final int METHODID_DELETE_VALUE = 3;
  private static final int METHODID_DELETE_ALL_VALUES = 4;
  private static final int METHODID_GET_KEYS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CacheServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CacheServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.dhan.cache.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.PingResponse>) responseObserver);
          break;
        case METHODID_GET_VALUE:
          serviceImpl.getValue((com.dhan.cache.GetValueRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.GetValueResponse>) responseObserver);
          break;
        case METHODID_PUT_VALUE:
          serviceImpl.putValue((com.dhan.cache.PutValueRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.PutValueResponse>) responseObserver);
          break;
        case METHODID_DELETE_VALUE:
          serviceImpl.deleteValue((com.dhan.cache.DeleteValueRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.DeleteValueResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALL_VALUES:
          serviceImpl.deleteAllValues((com.dhan.cache.DeleteAllValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.DeleteAllValuesResponse>) responseObserver);
          break;
        case METHODID_GET_KEYS:
          serviceImpl.getKeys((com.dhan.cache.GetKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.dhan.cache.GetKeysResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CacheServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dhan.cache.CacheServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CacheService");
    }
  }

  private static final class CacheServiceFileDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier {
    CacheServiceFileDescriptorSupplier() {}
  }

  private static final class CacheServiceMethodDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CacheServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CacheServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CacheServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetValueMethod())
              .addMethod(getPutValueMethod())
              .addMethod(getDeleteValueMethod())
              .addMethod(getDeleteAllValuesMethod())
              .addMethod(getGetKeysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
