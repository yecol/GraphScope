// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator.proto

package com.alibaba.maxgraph.proto;

public interface HeartbeartResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HeartbeartResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 clusterStateVersion = 1;</code>
   */
  long getClusterStateVersion();

  /**
   * <code>optional .ClusterStateProto clusterState = 2;</code>
   */
  boolean hasClusterState();
  /**
   * <code>optional .ClusterStateProto clusterState = 2;</code>
   */
  com.alibaba.maxgraph.proto.ClusterStateProto getClusterState();
  /**
   * <code>optional .ClusterStateProto clusterState = 2;</code>
   */
  com.alibaba.maxgraph.proto.ClusterStateProtoOrBuilder getClusterStateOrBuilder();

  /**
   * <code>optional uint64 aliveId = 3;</code>
   */
  long getAliveId();

  /**
   * <code>optional bool isLegal = 4;</code>
   */
  boolean getIsLegal();
}
