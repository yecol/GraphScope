#include <string>
#include <jni.h>
#include <new>
#include "core/java/type_alias.h"

#ifdef __cplusplus
extern "C" {
#endif

// Common Stubs

JNIEXPORT
jint JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303__1elementSize_00024_00024_00024(JNIEnv*, jclass) {
    return (jint)sizeof(gs::NbrDefault<uint32_t>);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeDec(JNIEnv*, jclass, jlong ptr) {
	return reinterpret_cast<jlong>(&(--(*reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr))));
}

JNIEXPORT
jboolean JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeEq(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	return ((*reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr)) == (*reinterpret_cast<gs::NbrDefault<uint32_t>*>(arg0))) ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT
jdouble JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeGetDouble(JNIEnv*, jclass, jlong ptr, jint arg0 /* arg00 */) {
	return (jdouble)(reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr)->get_double(arg0));
}

JNIEXPORT
jint JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeGetInt(JNIEnv*, jclass, jlong ptr, jint arg0 /* arg00 */) {
	return (jint)(reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr)->get_int(arg0));
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeGetString(JNIEnv*, jclass, jlong ptr, jlong rv_base, jint arg0 /* arg00 */) {
	return reinterpret_cast<jlong>(new((void*)rv_base) std::string(reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr)->get_str(arg0)));
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeInc(JNIEnv*, jclass, jlong ptr) {
	return reinterpret_cast<jlong>(&(++(*reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr))));
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeNeighbor(JNIEnv*, jclass, jlong ptr, jlong rv_base) {
	return reinterpret_cast<jlong>(new((void*)rv_base) grape::Vertex<uint32_t>(reinterpret_cast<gs::NbrDefault<uint32_t>*>(ptr)->neighbor()));
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_ds_PropertyNbr_1cxx_10x8f90c303_nativeCreateFactory0(JNIEnv*, jclass) {
	return reinterpret_cast<jlong>(new gs::NbrDefault<uint32_t>());
}

#ifdef __cplusplus
}
#endif
