#include <jni.h>
#include <new>
#include "core/java/java_messages.h"

#ifdef __cplusplus
extern "C" {
#endif

// Common Stubs

JNIEXPORT
jint JNICALL Java_com_alibaba_graphscope_parallel_message_PrimitiveMessage_1cxx_10x5581102c__1elementSize_00024_00024_00024(JNIEnv*, jclass) {
    return (jint)sizeof(gs::PrimitiveMessage<int64_t>);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_parallel_message_PrimitiveMessage_1cxx_10x5581102c_nativeGetData(JNIEnv*, jclass, jlong ptr) {
	return (jlong)(reinterpret_cast<gs::PrimitiveMessage<int64_t>*>(ptr)->getData());
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_parallel_message_PrimitiveMessage_1cxx_10x5581102c_nativeSetData(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	reinterpret_cast<gs::PrimitiveMessage<int64_t>*>(ptr)->setData(arg0);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_parallel_message_PrimitiveMessage_1cxx_10x5581102c_nativeCreateFactory0(JNIEnv*, jclass) {
	return reinterpret_cast<jlong>(new gs::PrimitiveMessage<int64_t>());
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_parallel_message_PrimitiveMessage_1cxx_10x5581102c_nativeCreateFactory1(JNIEnv*, jclass, jlong arg0 /* arg00 */) {
	return reinterpret_cast<jlong>(new gs::PrimitiveMessage<int64_t>(arg0));
}

#ifdef __cplusplus
}
#endif