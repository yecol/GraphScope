#include <jni.h>
#include <new>
#include <vector>
#include <string>
#include "core/java/type_alias.h"

#ifdef __cplusplus
extern "C" {
#endif

// Common Stubs

JNIEXPORT
jint JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934__1elementSize_00024_00024_00024(JNIEnv*, jclass) {
    return (jint)sizeof(std::vector<gs::VertexArrayDefault<int64_t>>);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeCapacity(JNIEnv*, jclass, jlong ptr) {
	return (jlong)(reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->capacity());
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeClear(JNIEnv*, jclass, jlong ptr) {
	reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->clear();
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeData(JNIEnv*, jclass, jlong ptr) {
	return (jlong)(reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->data());
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeDelete(JNIEnv*, jclass, jlong ptr) {
	delete reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeGet(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	return reinterpret_cast<jlong>(&((*reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr))[arg0]));
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativePush_1back(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->push_back(*reinterpret_cast<gs::VertexArrayDefault<int64_t>*>(arg0));
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeReserve(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->reserve(arg0);
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeResize(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */) {
	reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->resize(arg0);
}

JNIEXPORT
void JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeSet(JNIEnv*, jclass, jlong ptr, jlong arg0 /* arg00 */, jlong arg1 /* arg11 */) {
	(*reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr))[arg0] = *reinterpret_cast<gs::VertexArrayDefault<int64_t>*>(arg1);
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeSize(JNIEnv*, jclass, jlong ptr) {
	return (jlong)(reinterpret_cast<std::vector<gs::VertexArrayDefault<int64_t>>*>(ptr)->size());
}

JNIEXPORT
jlong JNICALL Java_com_alibaba_graphscope_stdcxx_StdVector_1cxx_10x5725934_nativeCreateFactory0(JNIEnv*, jclass) {
	return reinterpret_cast<jlong>(new std::vector<gs::VertexArrayDefault<int64_t>>());
}

#ifdef __cplusplus
}
#endif
