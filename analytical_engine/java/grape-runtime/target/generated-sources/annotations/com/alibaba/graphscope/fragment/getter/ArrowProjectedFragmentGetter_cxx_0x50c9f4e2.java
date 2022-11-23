package com.alibaba.graphscope.fragment.getter;

import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.graphscope.ds.StringView;
import com.alibaba.graphscope.fragment.ArrowProjectedFragment;
import com.alibaba.graphscope.graphx.VineyardClient;
import com.alibaba.graphscope.stdcxx.StdSharedPtr;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType(
    value = "gs::ArrowProjectedFragmentGetter<int64_t,uint64_t,std::string,int32_t>",
    factory = ArrowProjectedFragmentGetter_cxx_0x50c9f4e2Factory.class
)
@FFISynthetic("com.alibaba.graphscope.fragment.getter.ArrowProjectedFragmentGetter")
public class ArrowProjectedFragmentGetter_cxx_0x50c9f4e2 extends FFIPointerImpl implements ArrowProjectedFragmentGetter<Long, Long, StringView, Integer> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(ArrowProjectedFragmentGetter_cxx_0x50c9f4e2.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public ArrowProjectedFragmentGetter_cxx_0x50c9f4e2(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArrowProjectedFragmentGetter_cxx_0x50c9f4e2 that = (ArrowProjectedFragmentGetter_cxx_0x50c9f4e2) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  @FFINameAlias("Get")
  @CXXValue
  public StdSharedPtr<ArrowProjectedFragment<Long, Long, StringView, Integer>> get(
      @CXXReference VineyardClient arg0, long arg1) {
    long ret$ = nativeGet(address, com.alibaba.fastffi.CXXValueScope.allocate(com.alibaba.graphscope.stdcxx.StdSharedPtr_cxx_0x33e4cd62.SIZE), ((com.alibaba.fastffi.FFIPointerImpl) arg0).address, arg1); return (new com.alibaba.graphscope.stdcxx.StdSharedPtr_cxx_0x33e4cd62(ret$));
  }

  @FFINameAlias("Get")
  @CXXValue
  public static native long nativeGet(long ptr, long rv_base, long arg00, long arg11);

  public static native long nativeCreateFactory0();
}