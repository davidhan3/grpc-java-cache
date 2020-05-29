// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CacheService.proto

package com.dhan.cache;

public final class CacheServiceOuterClass {
  private CacheServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_PingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_PingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_GetValueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_GetValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_GetValueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_GetValueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_PutValueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_PutValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_PutValueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_PutValueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_DeleteValueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_DeleteValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_DeleteValueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_DeleteValueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_DeleteAllValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_DeleteAllValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_DeleteAllValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_DeleteAllValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_GetKeysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_GetKeysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dhan_cache_GetKeysResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dhan_cache_GetKeysResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022CacheService.proto\022\016com.dhan.cache\"\036\n\013" +
      "PingRequest\022\017\n\007message\030\001 \001(\t\"\037\n\014PingResp" +
      "onse\022\017\n\007message\030\001 \001(\t\"\036\n\017GetValueRequest" +
      "\022\013\n\003key\030\001 \001(\t\"!\n\020GetValueResponse\022\r\n\005val" +
      "ue\030\001 \001(\t\"-\n\017PutValueRequest\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t\"$\n\020PutValueResponse\022\020\n\010r" +
      "esponse\030\001 \001(\010\"!\n\022DeleteValueRequest\022\013\n\003k" +
      "ey\030\001 \001(\t\"\'\n\023DeleteValueResponse\022\020\n\010respo" +
      "nse\030\001 \001(\010\"\030\n\026DeleteAllValuesRequest\"+\n\027D" +
      "eleteAllValuesResponse\022\020\n\010response\030\001 \001(\010" +
      "\"\020\n\016GetKeysRequest\"\037\n\017GetKeysResponse\022\014\n" +
      "\004keys\030\001 \003(\t2\367\003\n\014CacheService\022A\n\004ping\022\033.c" +
      "om.dhan.cache.PingRequest\032\034.com.dhan.cac" +
      "he.PingResponse\022M\n\010getValue\022\037.com.dhan.c" +
      "ache.GetValueRequest\032 .com.dhan.cache.Ge" +
      "tValueResponse\022M\n\010putValue\022\037.com.dhan.ca" +
      "che.PutValueRequest\032 .com.dhan.cache.Put" +
      "ValueResponse\022V\n\013deleteValue\022\".com.dhan." +
      "cache.DeleteValueRequest\032#.com.dhan.cach" +
      "e.DeleteValueResponse\022b\n\017deleteAllValues" +
      "\022&.com.dhan.cache.DeleteAllValuesRequest" +
      "\032\'.com.dhan.cache.DeleteAllValuesRespons" +
      "e\022J\n\007getKeys\022\036.com.dhan.cache.GetKeysReq" +
      "uest\032\037.com.dhan.cache.GetKeysResponseB\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_dhan_cache_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dhan_cache_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_PingRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_dhan_cache_PingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dhan_cache_PingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_PingResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_dhan_cache_GetValueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dhan_cache_GetValueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_GetValueRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_com_dhan_cache_GetValueResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dhan_cache_GetValueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_GetValueResponse_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_com_dhan_cache_PutValueRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dhan_cache_PutValueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_PutValueRequest_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dhan_cache_PutValueResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dhan_cache_PutValueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_PutValueResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_com_dhan_cache_DeleteValueRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_dhan_cache_DeleteValueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_DeleteValueRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_com_dhan_cache_DeleteValueResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_dhan_cache_DeleteValueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_DeleteValueResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_com_dhan_cache_DeleteAllValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_dhan_cache_DeleteAllValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_DeleteAllValuesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_dhan_cache_DeleteAllValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_dhan_cache_DeleteAllValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_DeleteAllValuesResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_com_dhan_cache_GetKeysRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_dhan_cache_GetKeysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_GetKeysRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_dhan_cache_GetKeysResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_dhan_cache_GetKeysResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dhan_cache_GetKeysResponse_descriptor,
        new java.lang.String[] { "Keys", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}