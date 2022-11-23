package com.alibaba.graphscope.arrow.array;

import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIForeignType;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointerImpl;
import com.alibaba.fastffi.FFISynthetic;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.graphscope.arrow.Status;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;

@FFIForeignType(
    value = "gs::ArrowArrayBuilder<int32_t>",
    factory = BaseArrowArrayBuilder_cxx_0x101bead8Factory.class
)
@FFISynthetic("com.alibaba.graphscope.arrow.array.BaseArrowArrayBuilder")
public class BaseArrowArrayBuilder_cxx_0x101bead8 extends FFIPointerImpl implements BaseArrowArrayBuilder<Integer> {
  public static final int SIZE;

  public static final int HASH_SHIFT;

  static {
    try {
      System.loadLibrary("grape-jni");
    } catch (UnsatisfiedLinkError e) {
      System.load(FFITypeFactory.findNativeLibrary(BaseArrowArrayBuilder_cxx_0x101bead8.class, "grape-jni"));
    }
  }
  static {
    SIZE = _elementSize$$$();
    assert SIZE > 0;
    HASH_SHIFT = 31 - Integer.numberOfLeadingZeros(1 + SIZE);
    assert HASH_SHIFT > 0;
  }

  public BaseArrowArrayBuilder_cxx_0x101bead8(final long address) {
    super(address);
  }

  private static final native int _elementSize$$$();

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseArrowArrayBuilder_cxx_0x101bead8 that = (BaseArrowArrayBuilder_cxx_0x101bead8) o;
    return this.address == that.address;
  }

  public int hashCode() {
    return (int) (address >> HASH_SHIFT);
  }

  public String toString() {
    return getClass().getName() + "@" + Long.toHexString(address);
  }

  @FFINameAlias("Reserve")
  @CXXValue
  public Status reserve(long arg0) {
    long ret$ = nativeReserve(address, com.alibaba.fastffi.CXXValueScope.allocate(com.alibaba.graphscope.arrow.Status_cxx_0xba0ae5b.SIZE), arg0); return (new com.alibaba.graphscope.arrow.Status_cxx_0xba0ae5b(ret$));
  }

  @FFINameAlias("Reserve")
  @CXXValue
  public static native long nativeReserve(long ptr, long rv_base, long arg00);

  public void setAddress(long arg0) {
    this.address = arg0;
  }

  public static native long nativeCreateFactory0();
}