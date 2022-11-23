package com.alibaba.graphscope.context.ffi;

import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.graphscope.ds.GSVertexArray;
import com.alibaba.graphscope.ds.Vertex;
import com.alibaba.graphscope.fragment.ArrowFragment;
import com.alibaba.graphscope.stdcxx.StdVector;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType(
    value = "gs::LabeledVertexDataContext<gs::ArrowFragmentDefault<int64_t>,double>",
    factory = FFILabeledVertexDataContext_cxx_0xc64d9ac3Factory.class
)
@FFISynthetic("com.alibaba.graphscope.context.ffi.FFILabeledVertexDataContext")
public class FFILabeledVertexDataContext_cxx_0xc64d9ac3 extends FFIPointerImpl implements FFILabeledVertexDataContext<ArrowFragment<Long>, Double> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(FFILabeledVertexDataContext_cxx_0xc64d9ac3.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public FFILabeledVertexDataContext_cxx_0xc64d9ac3(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FFILabeledVertexDataContext_cxx_0xc64d9ac3 that = (FFILabeledVertexDataContext_cxx_0xc64d9ac3) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  @CXXReference
  public StdVector<GSVertexArray<Double>> data() {
    long ret$ = nativeData(address); return (new com.alibaba.graphscope.stdcxx.StdVector_cxx_0x8cbe72bf(ret$));
  }

  @CXXReference
  public static native long nativeData(long ptr);

  @FFINameAlias("GetValue")
  @CXXValue
  public Double getValue(@CXXReference @FFITypeAlias("grape::Vertex<uint64_t>") Vertex<Long> arg0) {
    return nativeGetValue(address, ((com.alibaba.fastffi.FFIPointerImpl) arg0).address);
  }

  @FFINameAlias("GetValue")
  @CXXValue
  public static native double nativeGetValue(long ptr, long arg00);

  public static native long nativeCreateFactory0(long arg00, boolean arg11);
}