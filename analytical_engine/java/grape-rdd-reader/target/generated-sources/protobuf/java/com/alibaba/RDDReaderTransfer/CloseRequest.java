// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rdd.proto

package com.alibaba.RDDReaderTransfer;

/**
 * Protobuf type {@code RDDReaderTransfer.CloseRequest}
 */
public final class CloseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RDDReaderTransfer.CloseRequest)
    CloseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloseRequest.newBuilder() to construct.
  private CloseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloseRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CloseRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            req_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.RDDReaderTransfer.RDDReaderTransferProto.internal_static_RDDReaderTransfer_CloseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.RDDReaderTransfer.RDDReaderTransferProto.internal_static_RDDReaderTransfer_CloseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.RDDReaderTransfer.CloseRequest.class, com.alibaba.RDDReaderTransfer.CloseRequest.Builder.class);
  }

  public static final int REQ_FIELD_NUMBER = 1;
  private boolean req_;
  /**
   * <code>bool req = 1;</code>
   * @return The req.
   */
  @java.lang.Override
  public boolean getReq() {
    return req_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (req_ != false) {
      output.writeBool(1, req_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (req_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, req_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.RDDReaderTransfer.CloseRequest)) {
      return super.equals(obj);
    }
    com.alibaba.RDDReaderTransfer.CloseRequest other = (com.alibaba.RDDReaderTransfer.CloseRequest) obj;

    if (getReq()
        != other.getReq()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReq());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.RDDReaderTransfer.CloseRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.RDDReaderTransfer.CloseRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RDDReaderTransfer.CloseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RDDReaderTransfer.CloseRequest)
      com.alibaba.RDDReaderTransfer.CloseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.RDDReaderTransfer.RDDReaderTransferProto.internal_static_RDDReaderTransfer_CloseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.RDDReaderTransfer.RDDReaderTransferProto.internal_static_RDDReaderTransfer_CloseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.RDDReaderTransfer.CloseRequest.class, com.alibaba.RDDReaderTransfer.CloseRequest.Builder.class);
    }

    // Construct using com.alibaba.RDDReaderTransfer.CloseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      req_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.RDDReaderTransfer.RDDReaderTransferProto.internal_static_RDDReaderTransfer_CloseRequest_descriptor;
    }

    @java.lang.Override
    public com.alibaba.RDDReaderTransfer.CloseRequest getDefaultInstanceForType() {
      return com.alibaba.RDDReaderTransfer.CloseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.alibaba.RDDReaderTransfer.CloseRequest build() {
      com.alibaba.RDDReaderTransfer.CloseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alibaba.RDDReaderTransfer.CloseRequest buildPartial() {
      com.alibaba.RDDReaderTransfer.CloseRequest result = new com.alibaba.RDDReaderTransfer.CloseRequest(this);
      result.req_ = req_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.RDDReaderTransfer.CloseRequest) {
        return mergeFrom((com.alibaba.RDDReaderTransfer.CloseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.RDDReaderTransfer.CloseRequest other) {
      if (other == com.alibaba.RDDReaderTransfer.CloseRequest.getDefaultInstance()) return this;
      if (other.getReq() != false) {
        setReq(other.getReq());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.RDDReaderTransfer.CloseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.RDDReaderTransfer.CloseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean req_ ;
    /**
     * <code>bool req = 1;</code>
     * @return The req.
     */
    @java.lang.Override
    public boolean getReq() {
      return req_;
    }
    /**
     * <code>bool req = 1;</code>
     * @param value The req to set.
     * @return This builder for chaining.
     */
    public Builder setReq(boolean value) {
      
      req_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool req = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReq() {
      
      req_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RDDReaderTransfer.CloseRequest)
  }

  // @@protoc_insertion_point(class_scope:RDDReaderTransfer.CloseRequest)
  private static final com.alibaba.RDDReaderTransfer.CloseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.RDDReaderTransfer.CloseRequest();
  }

  public static com.alibaba.RDDReaderTransfer.CloseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloseRequest>
      PARSER = new com.google.protobuf.AbstractParser<CloseRequest>() {
    @java.lang.Override
    public CloseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CloseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CloseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alibaba.RDDReaderTransfer.CloseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
