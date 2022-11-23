package com.alibaba.graphscope.ds;

import com.alibaba.fastffi.CXXOperator;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType("grape::AdjList<uint64_t,double>")
@FFISynthetic("com.alibaba.graphscope.ds.GrapeAdjList")
public class GrapeAdjList_cxx_0x8c030f50 extends FFIPointerImpl implements GrapeAdjList<Long, Double> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(GrapeAdjList_cxx_0x8c030f50.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public GrapeAdjList_cxx_0x8c030f50(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GrapeAdjList_cxx_0x8c030f50 that = (GrapeAdjList_cxx_0x8c030f50) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  public GrapeNbr<Long, Double> begin_pointer() {
    long ret$ = nativeBegin_pointer(address); return (ret$ == 0L ? null : new com.alibaba.graphscope.ds.GrapeNbr_cxx_0xa3660297(ret$));
  }

  public static native long nativeBegin_pointer(long ptr);

  @CXXOperator("delete")
  public void delete() {
    nativeDelete(address);
  }

  @CXXOperator("delete")
  public static native void nativeDelete(long ptr);

  public GrapeNbr<Long, Double> end_pointer() {
    long ret$ = nativeEnd_pointer(address); return (ret$ == 0L ? null : new com.alibaba.graphscope.ds.GrapeNbr_cxx_0xa3660297(ret$));
  }

  public static native long nativeEnd_pointer(long ptr);

  @FFINameAlias("Size")
  public long size() {
    return nativeSize(address);
  }

  @FFINameAlias("Size")
  public static native long nativeSize(long ptr);
}