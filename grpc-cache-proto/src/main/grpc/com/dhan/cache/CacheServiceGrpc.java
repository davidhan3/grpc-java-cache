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
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_VALUE = 1;
  private static final int METHODID_PUT_VALUE = 2;

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
              .build();
        }
      }
    }
    return result;
  }
}
