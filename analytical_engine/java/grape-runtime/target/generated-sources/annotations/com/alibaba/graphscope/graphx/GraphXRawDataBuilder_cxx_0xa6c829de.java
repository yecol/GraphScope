package com.alibaba.graphscope.graphx;

import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.graphscope.stdcxx.StdSharedPtr;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType(
    value = "gs::GraphXRawDataBuilder<int64_t,uint64_t,int64_t,int64_t>",
    factory = GraphXRawDataBuilder_cxx_0xa6c829deFactory.class
)
@FFISynthetic("com.alibaba.graphscope.graphx.GraphXRawDataBuilder")
public class GraphXRawDataBuilder_cxx_0xa6c829de extends FFIPointerImpl implements GraphXRawDataBuilder<Long, Long, Long, Long> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(GraphXRawDataBuilder_cxx_0xa6c829de.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public GraphXRawDataBuilder_cxx_0xa6c829de(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GraphXRawDataBuilder_cxx_0xa6c829de that = (GraphXRawDataBuilder_cxx_0xa6c829de) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  @FFINameAlias("MySeal")
  @CXXValue
  public StdSharedPtr<GraphXRawData<Long, Long, Long, Long>> seal(
      @CXXReference VineyardClient arg0) {
    long ret$ = nativeSeal(address, com.alibaba.fastffi.CXXValueScope.allocate(com.alibaba.graphscope.stdcxx.StdSharedPtr_cxx_0xbc62baa8.SIZE), ((com.alibaba.fastffi.FFIPointerImpl) arg0).address); return (new com.alibaba.graphscope.stdcxx.StdSharedPtr_cxx_0xbc62baa8(ret$));
  }

  @FFINameAlias("MySeal")
  @CXXValue
  public static native long nativeSeal(long ptr, long rv_base, long arg00);

  public static native long nativeCreateFactory0(long arg00, long arg11, long arg22, long arg33,
      long arg44, long arg55);
}
