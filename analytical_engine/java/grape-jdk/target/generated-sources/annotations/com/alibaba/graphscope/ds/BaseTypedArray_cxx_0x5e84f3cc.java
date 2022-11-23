package com.alibaba.graphscope.ds;

import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType("gs::arrow_projected_fragment_impl::TypedArray<vineyard::arrow_string_view>")
@FFISynthetic("com.alibaba.graphscope.ds.BaseTypedArray")
public class BaseTypedArray_cxx_0x5e84f3cc extends FFIPointerImpl implements BaseTypedArray<StringView> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(BaseTypedArray_cxx_0x5e84f3cc.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public BaseTypedArray_cxx_0x5e84f3cc(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseTypedArray_cxx_0x5e84f3cc that = (BaseTypedArray_cxx_0x5e84f3cc) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  @FFINameAlias("GetLength")
  public long getLength() {
    return nativeGetLength(address);
  }

  @FFINameAlias("GetLength")
  public static native long nativeGetLength(long ptr);

  public void setAddress(long arg0) {
    this.address = arg0;
  }
}