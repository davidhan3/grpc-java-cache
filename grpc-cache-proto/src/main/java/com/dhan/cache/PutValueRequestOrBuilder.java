// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CacheService.proto

package com.dhan.cache;

public interface PutValueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dhan.cache.PutValueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}