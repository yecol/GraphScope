package com.alibaba.graphscope.stdcxx;

import com.alibaba.fastffi.CXXOperator;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.graphscope.ds.GSVertexArray;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType(
    value = "std::vector<gs::VertexArrayDefault<int64_t>>",
    factory = StdVector_cxx_0x5725934Factory.class
)
@FFISynthetic("com.alibaba.graphscope.stdcxx.StdVector")
public class StdVector_cxx_0x5725934 extends FFIPointerImpl implements StdVector<GSVertexArray<Long>> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(StdVector_cxx_0x5725934.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public StdVector_cxx_0x5725934(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StdVector_cxx_0x5725934 that = (StdVector_cxx_0x5725934) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  public long capacity() {
    return nativeCapacity(address);
  }

  public static native long nativeCapacity(long ptr);

  public void clear() {
    nativeClear(address);
  }

  public static native void nativeClear(long ptr);

  public long data() {
    return nativeData(address);
  }

  public static native long nativeData(long ptr);

  @CXXOperator("delete")
  public void delete() {
    nativeDelete(address);
  }

  @CXXOperator("delete")
  public static native void nativeDelete(long ptr);

  @CXXOperator("[]")
  @CXXReference
  public GSVertexArray<Long> get(long arg0) {
    long ret$ = nativeGet(address, arg0); return (new com.alibaba.graphscope.ds.GSVertexArray_cxx_0x2d166c60(ret$));
  }

  @CXXOperator("[]")
  @CXXReference
  public static native long nativeGet(long ptr, long arg00);

  public void push_back(@CXXValue GSVertexArray<Long> arg0) {
    nativePush_back(address, ((com.alibaba.fastffi.FFIPointerImpl) arg0).address);
  }

  public static native void nativePush_back(long ptr, long arg00);

  public void reserve(long arg0) {
    nativeReserve(address, arg0);
  }

  public static native void nativeReserve(long ptr, long arg00);

  public void resize(long arg0) {
    nativeResize(address, arg0);
  }

  public static native void nativeResize(long ptr, long arg00);

  @CXXOperator("[]")
  public void set(long arg0, @CXXReference GSVertexArray<Long> arg1) {
    nativeSet(address, arg0, ((com.alibaba.fastffi.FFIPointerImpl) arg1).address);
  }

  @CXXOperator("[]")
  public static native void nativeSet(long ptr, long arg00, long arg11);

  public void setAddress(long arg0) {
    this.address = arg0;
  }

  public long size() {
    return nativeSize(address);
  }

  public static native long nativeSize(long ptr);

  public static native long nativeCreateFactory0();
}