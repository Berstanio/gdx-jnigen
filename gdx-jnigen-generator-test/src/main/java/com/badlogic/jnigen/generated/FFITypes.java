package com.badlogic.jnigen.generated;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import java.util.HashMap;

public class FFITypes {

    /*JNI
		#include <jnigen.h>
		#include <test_data.h>
*/
    /*JNI
		#if !((defined(_WIN32) && ARCH_BITS == 32) || (defined(_WIN32) && ARCH_BITS == 64) || (!defined(_WIN32) && ARCH_BITS == 32 && !defined(__i386__)) || (!defined(_WIN32) && ARCH_BITS == 64) || (!defined(_WIN32) && defined(__i386__)))
			#error Unsupported OS/Platform
		#endif
		

		#if defined(_WIN32) && ARCH_BITS == 32
		static_assert(sizeof(ssize_t) == 4, "Type ssize_t has unexpected size.");
		static_assert(alignof(ssize_t) == 4, "Type ssize_t has unexpected alignment.");
		static_assert(sizeof(bool) == 1, "Type bool has unexpected size.");
		static_assert(alignof(bool) == 1, "Type bool has unexpected alignment.");
		static_assert(sizeof(uint64_t) == 8, "Type uint64_t has unexpected size.");
		static_assert(alignof(uint64_t) == 8, "Type uint64_t has unexpected alignment.");
		static_assert(sizeof(conditional_word_t) == 4, "Type conditional_word_t has unexpected size.");
		static_assert(alignof(conditional_word_t) == 4, "Type conditional_word_t has unexpected alignment.");
		static_assert(sizeof(signed char) == 1, "Type signed char has unexpected size.");
		static_assert(alignof(signed char) == 1, "Type signed char has unexpected alignment.");
		static_assert(sizeof(size_t) == 4, "Type size_t has unexpected size.");
		static_assert(alignof(size_t) == 4, "Type size_t has unexpected alignment.");
		static_assert(sizeof(float) == 4, "Type float has unexpected size.");
		static_assert(alignof(float) == 4, "Type float has unexpected alignment.");
		static_assert(sizeof(long) == 4, "Type long has unexpected size.");
		static_assert(alignof(long) == 4, "Type long has unexpected alignment.");
		static_assert(sizeof(intptr_t) == 4, "Type intptr_t has unexpected size.");
		static_assert(alignof(intptr_t) == 4, "Type intptr_t has unexpected alignment.");
		static_assert(sizeof(my_size_t) == 4, "Type my_size_t has unexpected size.");
		static_assert(alignof(my_size_t) == 4, "Type my_size_t has unexpected alignment.");
		static_assert(sizeof(const char) == 1, "Type const char has unexpected size.");
		static_assert(alignof(const char) == 1, "Type const char has unexpected alignment.");
		static_assert(sizeof(const size_t) == 4, "Type const size_t has unexpected size.");
		static_assert(alignof(const size_t) == 4, "Type const size_t has unexpected alignment.");
		static_assert(sizeof(double) == 8, "Type double has unexpected size.");
		static_assert(alignof(double) == 8, "Type double has unexpected alignment.");
		static_assert(sizeof(uint32_t) == 4, "Type uint32_t has unexpected size.");
		static_assert(alignof(uint32_t) == 4, "Type uint32_t has unexpected alignment.");
		static_assert(sizeof(unsigned char) == 1, "Type unsigned char has unexpected size.");
		static_assert(alignof(unsigned char) == 1, "Type unsigned char has unexpected alignment.");
		static_assert(sizeof(uintptr_t) == 4, "Type uintptr_t has unexpected size.");
		static_assert(alignof(uintptr_t) == 4, "Type uintptr_t has unexpected alignment.");
		static_assert(sizeof(int) == 4, "Type int has unexpected size.");
		static_assert(alignof(int) == 4, "Type int has unexpected alignment.");
		static_assert(sizeof(uint16_t) == 2, "Type uint16_t has unexpected size.");
		static_assert(alignof(uint16_t) == 2, "Type uint16_t has unexpected alignment.");
		static_assert(sizeof(unsigned int) == 4, "Type unsigned int has unexpected size.");
		static_assert(alignof(unsigned int) == 4, "Type unsigned int has unexpected alignment.");
		static_assert(sizeof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected size.");
		static_assert(alignof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected alignment.");
		static_assert(sizeof(char) == 1, "Type char has unexpected size.");
		static_assert(alignof(char) == 1, "Type char has unexpected alignment.");
		static_assert(sizeof(short) == 2, "Type short has unexpected size.");
		static_assert(alignof(short) == 2, "Type short has unexpected alignment.");
		static_assert(sizeof(uint8_t) == 1, "Type uint8_t has unexpected size.");
		static_assert(alignof(uint8_t) == 1, "Type uint8_t has unexpected alignment.");
		static_assert(sizeof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected size.");
		static_assert(alignof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected alignment.");
		static_assert(sizeof(GlobalArg) == 32, "Type GlobalArg has unexpected size.");
		static_assert(alignof(GlobalArg) == 8, "Type GlobalArg has unexpected alignment.");
		static_assert(offsetof(GlobalArg, longVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, shortVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, byteVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, charVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, boolVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, floatVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, doubleVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtrPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, unionPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, allArgs) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(sizeof(AnonymousStructField) == 12, "Type AnonymousStructField has unexpected size.");
		static_assert(alignof(AnonymousStructField) == 4, "Type AnonymousStructField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructField, inner) == 0, "Type AnonymousStructField has unexpected offset.");
		static_assert(offsetof(AnonymousStructField, externalValue) == 8, "Type AnonymousStructField has unexpected offset.");
		static_assert(sizeof(TestStruct) == 16, "Type TestStruct has unexpected size.");
		static_assert(alignof(TestStruct) == 8, "Type TestStruct has unexpected alignment.");
		static_assert(offsetof(TestStruct, field1) == 0, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field2) == 8, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field3) == 12, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field4) == 14, "Type TestStruct has unexpected offset.");
		static_assert(sizeof(AnonymousClosure) == 8, "Type AnonymousClosure has unexpected size.");
		static_assert(alignof(AnonymousClosure) == 4, "Type AnonymousClosure has unexpected alignment.");
		static_assert(offsetof(AnonymousClosure, someClosure) == 0, "Type AnonymousClosure has unexpected offset.");
		static_assert(offsetof(AnonymousClosure, anotherClosure) == 4, "Type AnonymousClosure has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldEnd) == 12, "Type AnonymousStructNoFieldEnd has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldEnd) == 4, "Type AnonymousStructNoFieldEnd has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, externalValue) == 0, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, intValue) == 4, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, floatValue) == 8, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoField) == 12, "Type AnonymousStructNoField has unexpected size.");
		static_assert(alignof(AnonymousStructNoField) == 4, "Type AnonymousStructNoField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoField, intValue) == 0, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, floatValue) == 4, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, externalValue) == 8, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(sizeof(WordStruct) == 20, "Type WordStruct has unexpected size.");
		static_assert(alignof(WordStruct) == 4, "Type WordStruct has unexpected alignment.");
		static_assert(offsetof(WordStruct, tag) == 0, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, count) == 4, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, delta) == 8, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, address) == 12, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, aliased) == 16, "Type WordStruct has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldNested) == 12, "Type AnonymousStructNoFieldNested has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldNested) == 4, "Type AnonymousStructNoFieldNested has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldNested, intValue1) == 0, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, floatValue2) == 4, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, externalValue) == 8, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(sizeof(AnonymousStructFieldArray) == 20, "Type AnonymousStructFieldArray has unexpected size.");
		static_assert(alignof(AnonymousStructFieldArray) == 4, "Type AnonymousStructFieldArray has unexpected alignment.");
		static_assert(offsetof(AnonymousStructFieldArray, inner) == 0, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(offsetof(AnonymousStructFieldArray, externalValue) == 16, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldConsecutive) == 20, "Type AnonymousStructNoFieldConsecutive has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldConsecutive) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, externalValue) == 0, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue1) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue1) == 8, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue2) == 12, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue2) == 16, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(sizeof(TestUnion) == 16, "Type TestUnion has unexpected size.");
		static_assert(alignof(TestUnion) == 8, "Type TestUnion has unexpected alignment.");
		static_assert(offsetof(TestUnion, uintType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, doubleType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, fixedSizeInt) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, structType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(sizeof(SpecialStruct) == 28, "Type SpecialStruct has unexpected size.");
		static_assert(alignof(SpecialStruct) == 4, "Type SpecialStruct has unexpected alignment.");
		static_assert(offsetof(SpecialStruct, floatPtrField) == 0, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, arrayField) == 4, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, intPtrField) == 24, "Type SpecialStruct has unexpected offset.");
		#endif // defined(_WIN32) && ARCH_BITS == 32
		

		#if defined(_WIN32) && ARCH_BITS == 64
		static_assert(sizeof(ssize_t) == 8, "Type ssize_t has unexpected size.");
		static_assert(alignof(ssize_t) == 8, "Type ssize_t has unexpected alignment.");
		static_assert(sizeof(bool) == 1, "Type bool has unexpected size.");
		static_assert(alignof(bool) == 1, "Type bool has unexpected alignment.");
		static_assert(sizeof(uint64_t) == 8, "Type uint64_t has unexpected size.");
		static_assert(alignof(uint64_t) == 8, "Type uint64_t has unexpected alignment.");
		static_assert(sizeof(conditional_word_t) == 8, "Type conditional_word_t has unexpected size.");
		static_assert(alignof(conditional_word_t) == 8, "Type conditional_word_t has unexpected alignment.");
		static_assert(sizeof(signed char) == 1, "Type signed char has unexpected size.");
		static_assert(alignof(signed char) == 1, "Type signed char has unexpected alignment.");
		static_assert(sizeof(size_t) == 8, "Type size_t has unexpected size.");
		static_assert(alignof(size_t) == 8, "Type size_t has unexpected alignment.");
		static_assert(sizeof(float) == 4, "Type float has unexpected size.");
		static_assert(alignof(float) == 4, "Type float has unexpected alignment.");
		static_assert(sizeof(long) == 4, "Type long has unexpected size.");
		static_assert(alignof(long) == 4, "Type long has unexpected alignment.");
		static_assert(sizeof(intptr_t) == 8, "Type intptr_t has unexpected size.");
		static_assert(alignof(intptr_t) == 8, "Type intptr_t has unexpected alignment.");
		static_assert(sizeof(my_size_t) == 8, "Type my_size_t has unexpected size.");
		static_assert(alignof(my_size_t) == 8, "Type my_size_t has unexpected alignment.");
		static_assert(sizeof(const char) == 1, "Type const char has unexpected size.");
		static_assert(alignof(const char) == 1, "Type const char has unexpected alignment.");
		static_assert(sizeof(const size_t) == 8, "Type const size_t has unexpected size.");
		static_assert(alignof(const size_t) == 8, "Type const size_t has unexpected alignment.");
		static_assert(sizeof(double) == 8, "Type double has unexpected size.");
		static_assert(alignof(double) == 8, "Type double has unexpected alignment.");
		static_assert(sizeof(uint32_t) == 4, "Type uint32_t has unexpected size.");
		static_assert(alignof(uint32_t) == 4, "Type uint32_t has unexpected alignment.");
		static_assert(sizeof(unsigned char) == 1, "Type unsigned char has unexpected size.");
		static_assert(alignof(unsigned char) == 1, "Type unsigned char has unexpected alignment.");
		static_assert(sizeof(uintptr_t) == 8, "Type uintptr_t has unexpected size.");
		static_assert(alignof(uintptr_t) == 8, "Type uintptr_t has unexpected alignment.");
		static_assert(sizeof(int) == 4, "Type int has unexpected size.");
		static_assert(alignof(int) == 4, "Type int has unexpected alignment.");
		static_assert(sizeof(uint16_t) == 2, "Type uint16_t has unexpected size.");
		static_assert(alignof(uint16_t) == 2, "Type uint16_t has unexpected alignment.");
		static_assert(sizeof(unsigned int) == 4, "Type unsigned int has unexpected size.");
		static_assert(alignof(unsigned int) == 4, "Type unsigned int has unexpected alignment.");
		static_assert(sizeof(ptrdiff_t) == 8, "Type ptrdiff_t has unexpected size.");
		static_assert(alignof(ptrdiff_t) == 8, "Type ptrdiff_t has unexpected alignment.");
		static_assert(sizeof(char) == 1, "Type char has unexpected size.");
		static_assert(alignof(char) == 1, "Type char has unexpected alignment.");
		static_assert(sizeof(short) == 2, "Type short has unexpected size.");
		static_assert(alignof(short) == 2, "Type short has unexpected alignment.");
		static_assert(sizeof(uint8_t) == 1, "Type uint8_t has unexpected size.");
		static_assert(alignof(uint8_t) == 1, "Type uint8_t has unexpected alignment.");
		static_assert(sizeof(const conditional_word_t) == 8, "Type const conditional_word_t has unexpected size.");
		static_assert(alignof(const conditional_word_t) == 8, "Type const conditional_word_t has unexpected alignment.");
		static_assert(sizeof(GlobalArg) == 32, "Type GlobalArg has unexpected size.");
		static_assert(alignof(GlobalArg) == 8, "Type GlobalArg has unexpected alignment.");
		static_assert(offsetof(GlobalArg, longVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, shortVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, byteVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, charVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, boolVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, floatVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, doubleVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtrPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, unionPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, allArgs) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(sizeof(AnonymousStructField) == 12, "Type AnonymousStructField has unexpected size.");
		static_assert(alignof(AnonymousStructField) == 4, "Type AnonymousStructField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructField, inner) == 0, "Type AnonymousStructField has unexpected offset.");
		static_assert(offsetof(AnonymousStructField, externalValue) == 8, "Type AnonymousStructField has unexpected offset.");
		static_assert(sizeof(TestStruct) == 16, "Type TestStruct has unexpected size.");
		static_assert(alignof(TestStruct) == 8, "Type TestStruct has unexpected alignment.");
		static_assert(offsetof(TestStruct, field1) == 0, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field2) == 8, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field3) == 12, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field4) == 14, "Type TestStruct has unexpected offset.");
		static_assert(sizeof(AnonymousClosure) == 16, "Type AnonymousClosure has unexpected size.");
		static_assert(alignof(AnonymousClosure) == 8, "Type AnonymousClosure has unexpected alignment.");
		static_assert(offsetof(AnonymousClosure, someClosure) == 0, "Type AnonymousClosure has unexpected offset.");
		static_assert(offsetof(AnonymousClosure, anotherClosure) == 8, "Type AnonymousClosure has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldEnd) == 12, "Type AnonymousStructNoFieldEnd has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldEnd) == 4, "Type AnonymousStructNoFieldEnd has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, externalValue) == 0, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, intValue) == 4, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, floatValue) == 8, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoField) == 12, "Type AnonymousStructNoField has unexpected size.");
		static_assert(alignof(AnonymousStructNoField) == 4, "Type AnonymousStructNoField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoField, intValue) == 0, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, floatValue) == 4, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, externalValue) == 8, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(sizeof(WordStruct) == 40, "Type WordStruct has unexpected size.");
		static_assert(alignof(WordStruct) == 8, "Type WordStruct has unexpected alignment.");
		static_assert(offsetof(WordStruct, tag) == 0, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, count) == 8, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, delta) == 16, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, address) == 24, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, aliased) == 32, "Type WordStruct has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldNested) == 12, "Type AnonymousStructNoFieldNested has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldNested) == 4, "Type AnonymousStructNoFieldNested has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldNested, intValue1) == 0, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, floatValue2) == 4, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, externalValue) == 8, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(sizeof(AnonymousStructFieldArray) == 20, "Type AnonymousStructFieldArray has unexpected size.");
		static_assert(alignof(AnonymousStructFieldArray) == 4, "Type AnonymousStructFieldArray has unexpected alignment.");
		static_assert(offsetof(AnonymousStructFieldArray, inner) == 0, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(offsetof(AnonymousStructFieldArray, externalValue) == 16, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldConsecutive) == 20, "Type AnonymousStructNoFieldConsecutive has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldConsecutive) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, externalValue) == 0, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue1) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue1) == 8, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue2) == 12, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue2) == 16, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(sizeof(TestUnion) == 16, "Type TestUnion has unexpected size.");
		static_assert(alignof(TestUnion) == 8, "Type TestUnion has unexpected alignment.");
		static_assert(offsetof(TestUnion, uintType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, doubleType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, fixedSizeInt) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, structType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(sizeof(SpecialStruct) == 40, "Type SpecialStruct has unexpected size.");
		static_assert(alignof(SpecialStruct) == 8, "Type SpecialStruct has unexpected alignment.");
		static_assert(offsetof(SpecialStruct, floatPtrField) == 0, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, arrayField) == 8, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, intPtrField) == 32, "Type SpecialStruct has unexpected offset.");
		#endif // defined(_WIN32) && ARCH_BITS == 64
		

		#if !defined(_WIN32) && ARCH_BITS == 32 && !defined(__i386__)
		static_assert(sizeof(ssize_t) == 4, "Type ssize_t has unexpected size.");
		static_assert(alignof(ssize_t) == 4, "Type ssize_t has unexpected alignment.");
		static_assert(sizeof(bool) == 1, "Type bool has unexpected size.");
		static_assert(alignof(bool) == 1, "Type bool has unexpected alignment.");
		static_assert(sizeof(uint64_t) == 8, "Type uint64_t has unexpected size.");
		static_assert(alignof(uint64_t) == 8, "Type uint64_t has unexpected alignment.");
		static_assert(sizeof(conditional_word_t) == 4, "Type conditional_word_t has unexpected size.");
		static_assert(alignof(conditional_word_t) == 4, "Type conditional_word_t has unexpected alignment.");
		static_assert(sizeof(signed char) == 1, "Type signed char has unexpected size.");
		static_assert(alignof(signed char) == 1, "Type signed char has unexpected alignment.");
		static_assert(sizeof(size_t) == 4, "Type size_t has unexpected size.");
		static_assert(alignof(size_t) == 4, "Type size_t has unexpected alignment.");
		static_assert(sizeof(float) == 4, "Type float has unexpected size.");
		static_assert(alignof(float) == 4, "Type float has unexpected alignment.");
		static_assert(sizeof(long) == 4, "Type long has unexpected size.");
		static_assert(alignof(long) == 4, "Type long has unexpected alignment.");
		static_assert(sizeof(intptr_t) == 4, "Type intptr_t has unexpected size.");
		static_assert(alignof(intptr_t) == 4, "Type intptr_t has unexpected alignment.");
		static_assert(sizeof(my_size_t) == 4, "Type my_size_t has unexpected size.");
		static_assert(alignof(my_size_t) == 4, "Type my_size_t has unexpected alignment.");
		static_assert(sizeof(const char) == 1, "Type const char has unexpected size.");
		static_assert(alignof(const char) == 1, "Type const char has unexpected alignment.");
		static_assert(sizeof(const size_t) == 4, "Type const size_t has unexpected size.");
		static_assert(alignof(const size_t) == 4, "Type const size_t has unexpected alignment.");
		static_assert(sizeof(double) == 8, "Type double has unexpected size.");
		static_assert(alignof(double) == 8, "Type double has unexpected alignment.");
		static_assert(sizeof(uint32_t) == 4, "Type uint32_t has unexpected size.");
		static_assert(alignof(uint32_t) == 4, "Type uint32_t has unexpected alignment.");
		static_assert(sizeof(unsigned char) == 1, "Type unsigned char has unexpected size.");
		static_assert(alignof(unsigned char) == 1, "Type unsigned char has unexpected alignment.");
		static_assert(sizeof(uintptr_t) == 4, "Type uintptr_t has unexpected size.");
		static_assert(alignof(uintptr_t) == 4, "Type uintptr_t has unexpected alignment.");
		static_assert(sizeof(int) == 4, "Type int has unexpected size.");
		static_assert(alignof(int) == 4, "Type int has unexpected alignment.");
		static_assert(sizeof(uint16_t) == 2, "Type uint16_t has unexpected size.");
		static_assert(alignof(uint16_t) == 2, "Type uint16_t has unexpected alignment.");
		static_assert(sizeof(unsigned int) == 4, "Type unsigned int has unexpected size.");
		static_assert(alignof(unsigned int) == 4, "Type unsigned int has unexpected alignment.");
		static_assert(sizeof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected size.");
		static_assert(alignof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected alignment.");
		static_assert(sizeof(char) == 1, "Type char has unexpected size.");
		static_assert(alignof(char) == 1, "Type char has unexpected alignment.");
		static_assert(sizeof(short) == 2, "Type short has unexpected size.");
		static_assert(alignof(short) == 2, "Type short has unexpected alignment.");
		static_assert(sizeof(uint8_t) == 1, "Type uint8_t has unexpected size.");
		static_assert(alignof(uint8_t) == 1, "Type uint8_t has unexpected alignment.");
		static_assert(sizeof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected size.");
		static_assert(alignof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected alignment.");
		static_assert(sizeof(GlobalArg) == 32, "Type GlobalArg has unexpected size.");
		static_assert(alignof(GlobalArg) == 8, "Type GlobalArg has unexpected alignment.");
		static_assert(offsetof(GlobalArg, longVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, shortVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, byteVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, charVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, boolVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, floatVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, doubleVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtrPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, unionPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, allArgs) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(sizeof(AnonymousStructField) == 12, "Type AnonymousStructField has unexpected size.");
		static_assert(alignof(AnonymousStructField) == 4, "Type AnonymousStructField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructField, inner) == 0, "Type AnonymousStructField has unexpected offset.");
		static_assert(offsetof(AnonymousStructField, externalValue) == 8, "Type AnonymousStructField has unexpected offset.");
		static_assert(sizeof(TestStruct) == 16, "Type TestStruct has unexpected size.");
		static_assert(alignof(TestStruct) == 8, "Type TestStruct has unexpected alignment.");
		static_assert(offsetof(TestStruct, field1) == 0, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field2) == 8, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field3) == 12, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field4) == 14, "Type TestStruct has unexpected offset.");
		static_assert(sizeof(AnonymousClosure) == 8, "Type AnonymousClosure has unexpected size.");
		static_assert(alignof(AnonymousClosure) == 4, "Type AnonymousClosure has unexpected alignment.");
		static_assert(offsetof(AnonymousClosure, someClosure) == 0, "Type AnonymousClosure has unexpected offset.");
		static_assert(offsetof(AnonymousClosure, anotherClosure) == 4, "Type AnonymousClosure has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldEnd) == 12, "Type AnonymousStructNoFieldEnd has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldEnd) == 4, "Type AnonymousStructNoFieldEnd has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, externalValue) == 0, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, intValue) == 4, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, floatValue) == 8, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoField) == 12, "Type AnonymousStructNoField has unexpected size.");
		static_assert(alignof(AnonymousStructNoField) == 4, "Type AnonymousStructNoField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoField, intValue) == 0, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, floatValue) == 4, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, externalValue) == 8, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(sizeof(WordStruct) == 20, "Type WordStruct has unexpected size.");
		static_assert(alignof(WordStruct) == 4, "Type WordStruct has unexpected alignment.");
		static_assert(offsetof(WordStruct, tag) == 0, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, count) == 4, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, delta) == 8, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, address) == 12, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, aliased) == 16, "Type WordStruct has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldNested) == 12, "Type AnonymousStructNoFieldNested has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldNested) == 4, "Type AnonymousStructNoFieldNested has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldNested, intValue1) == 0, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, floatValue2) == 4, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, externalValue) == 8, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(sizeof(AnonymousStructFieldArray) == 20, "Type AnonymousStructFieldArray has unexpected size.");
		static_assert(alignof(AnonymousStructFieldArray) == 4, "Type AnonymousStructFieldArray has unexpected alignment.");
		static_assert(offsetof(AnonymousStructFieldArray, inner) == 0, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(offsetof(AnonymousStructFieldArray, externalValue) == 16, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldConsecutive) == 20, "Type AnonymousStructNoFieldConsecutive has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldConsecutive) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, externalValue) == 0, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue1) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue1) == 8, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue2) == 12, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue2) == 16, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(sizeof(TestUnion) == 16, "Type TestUnion has unexpected size.");
		static_assert(alignof(TestUnion) == 8, "Type TestUnion has unexpected alignment.");
		static_assert(offsetof(TestUnion, uintType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, doubleType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, fixedSizeInt) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, structType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(sizeof(SpecialStruct) == 28, "Type SpecialStruct has unexpected size.");
		static_assert(alignof(SpecialStruct) == 4, "Type SpecialStruct has unexpected alignment.");
		static_assert(offsetof(SpecialStruct, floatPtrField) == 0, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, arrayField) == 4, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, intPtrField) == 24, "Type SpecialStruct has unexpected offset.");
		#endif // !defined(_WIN32) && ARCH_BITS == 32 && !defined(__i386__)
		

		#if !defined(_WIN32) && ARCH_BITS == 64
		static_assert(sizeof(ssize_t) == 8, "Type ssize_t has unexpected size.");
		static_assert(alignof(ssize_t) == 8, "Type ssize_t has unexpected alignment.");
		static_assert(sizeof(bool) == 1, "Type bool has unexpected size.");
		static_assert(alignof(bool) == 1, "Type bool has unexpected alignment.");
		static_assert(sizeof(uint64_t) == 8, "Type uint64_t has unexpected size.");
		static_assert(alignof(uint64_t) == 8, "Type uint64_t has unexpected alignment.");
		static_assert(sizeof(conditional_word_t) == 8, "Type conditional_word_t has unexpected size.");
		static_assert(alignof(conditional_word_t) == 8, "Type conditional_word_t has unexpected alignment.");
		static_assert(sizeof(signed char) == 1, "Type signed char has unexpected size.");
		static_assert(alignof(signed char) == 1, "Type signed char has unexpected alignment.");
		static_assert(sizeof(size_t) == 8, "Type size_t has unexpected size.");
		static_assert(alignof(size_t) == 8, "Type size_t has unexpected alignment.");
		static_assert(sizeof(float) == 4, "Type float has unexpected size.");
		static_assert(alignof(float) == 4, "Type float has unexpected alignment.");
		static_assert(sizeof(long) == 8, "Type long has unexpected size.");
		static_assert(alignof(long) == 8, "Type long has unexpected alignment.");
		static_assert(sizeof(intptr_t) == 8, "Type intptr_t has unexpected size.");
		static_assert(alignof(intptr_t) == 8, "Type intptr_t has unexpected alignment.");
		static_assert(sizeof(my_size_t) == 8, "Type my_size_t has unexpected size.");
		static_assert(alignof(my_size_t) == 8, "Type my_size_t has unexpected alignment.");
		static_assert(sizeof(const char) == 1, "Type const char has unexpected size.");
		static_assert(alignof(const char) == 1, "Type const char has unexpected alignment.");
		static_assert(sizeof(const size_t) == 8, "Type const size_t has unexpected size.");
		static_assert(alignof(const size_t) == 8, "Type const size_t has unexpected alignment.");
		static_assert(sizeof(double) == 8, "Type double has unexpected size.");
		static_assert(alignof(double) == 8, "Type double has unexpected alignment.");
		static_assert(sizeof(uint32_t) == 4, "Type uint32_t has unexpected size.");
		static_assert(alignof(uint32_t) == 4, "Type uint32_t has unexpected alignment.");
		static_assert(sizeof(unsigned char) == 1, "Type unsigned char has unexpected size.");
		static_assert(alignof(unsigned char) == 1, "Type unsigned char has unexpected alignment.");
		static_assert(sizeof(uintptr_t) == 8, "Type uintptr_t has unexpected size.");
		static_assert(alignof(uintptr_t) == 8, "Type uintptr_t has unexpected alignment.");
		static_assert(sizeof(int) == 4, "Type int has unexpected size.");
		static_assert(alignof(int) == 4, "Type int has unexpected alignment.");
		static_assert(sizeof(uint16_t) == 2, "Type uint16_t has unexpected size.");
		static_assert(alignof(uint16_t) == 2, "Type uint16_t has unexpected alignment.");
		static_assert(sizeof(unsigned int) == 4, "Type unsigned int has unexpected size.");
		static_assert(alignof(unsigned int) == 4, "Type unsigned int has unexpected alignment.");
		static_assert(sizeof(ptrdiff_t) == 8, "Type ptrdiff_t has unexpected size.");
		static_assert(alignof(ptrdiff_t) == 8, "Type ptrdiff_t has unexpected alignment.");
		static_assert(sizeof(char) == 1, "Type char has unexpected size.");
		static_assert(alignof(char) == 1, "Type char has unexpected alignment.");
		static_assert(sizeof(short) == 2, "Type short has unexpected size.");
		static_assert(alignof(short) == 2, "Type short has unexpected alignment.");
		static_assert(sizeof(uint8_t) == 1, "Type uint8_t has unexpected size.");
		static_assert(alignof(uint8_t) == 1, "Type uint8_t has unexpected alignment.");
		static_assert(sizeof(const conditional_word_t) == 8, "Type const conditional_word_t has unexpected size.");
		static_assert(alignof(const conditional_word_t) == 8, "Type const conditional_word_t has unexpected alignment.");
		static_assert(sizeof(GlobalArg) == 32, "Type GlobalArg has unexpected size.");
		static_assert(alignof(GlobalArg) == 8, "Type GlobalArg has unexpected alignment.");
		static_assert(offsetof(GlobalArg, longVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, shortVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, byteVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, charVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, boolVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, floatVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, doubleVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtrPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, unionPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, allArgs) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(sizeof(AnonymousStructField) == 12, "Type AnonymousStructField has unexpected size.");
		static_assert(alignof(AnonymousStructField) == 4, "Type AnonymousStructField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructField, inner) == 0, "Type AnonymousStructField has unexpected offset.");
		static_assert(offsetof(AnonymousStructField, externalValue) == 8, "Type AnonymousStructField has unexpected offset.");
		static_assert(sizeof(TestStruct) == 16, "Type TestStruct has unexpected size.");
		static_assert(alignof(TestStruct) == 8, "Type TestStruct has unexpected alignment.");
		static_assert(offsetof(TestStruct, field1) == 0, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field2) == 8, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field3) == 12, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field4) == 14, "Type TestStruct has unexpected offset.");
		static_assert(sizeof(AnonymousClosure) == 16, "Type AnonymousClosure has unexpected size.");
		static_assert(alignof(AnonymousClosure) == 8, "Type AnonymousClosure has unexpected alignment.");
		static_assert(offsetof(AnonymousClosure, someClosure) == 0, "Type AnonymousClosure has unexpected offset.");
		static_assert(offsetof(AnonymousClosure, anotherClosure) == 8, "Type AnonymousClosure has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldEnd) == 12, "Type AnonymousStructNoFieldEnd has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldEnd) == 4, "Type AnonymousStructNoFieldEnd has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, externalValue) == 0, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, intValue) == 4, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, floatValue) == 8, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoField) == 12, "Type AnonymousStructNoField has unexpected size.");
		static_assert(alignof(AnonymousStructNoField) == 4, "Type AnonymousStructNoField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoField, intValue) == 0, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, floatValue) == 4, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, externalValue) == 8, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(sizeof(WordStruct) == 40, "Type WordStruct has unexpected size.");
		static_assert(alignof(WordStruct) == 8, "Type WordStruct has unexpected alignment.");
		static_assert(offsetof(WordStruct, tag) == 0, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, count) == 8, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, delta) == 16, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, address) == 24, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, aliased) == 32, "Type WordStruct has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldNested) == 12, "Type AnonymousStructNoFieldNested has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldNested) == 4, "Type AnonymousStructNoFieldNested has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldNested, intValue1) == 0, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, floatValue2) == 4, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, externalValue) == 8, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(sizeof(AnonymousStructFieldArray) == 20, "Type AnonymousStructFieldArray has unexpected size.");
		static_assert(alignof(AnonymousStructFieldArray) == 4, "Type AnonymousStructFieldArray has unexpected alignment.");
		static_assert(offsetof(AnonymousStructFieldArray, inner) == 0, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(offsetof(AnonymousStructFieldArray, externalValue) == 16, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldConsecutive) == 20, "Type AnonymousStructNoFieldConsecutive has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldConsecutive) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, externalValue) == 0, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue1) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue1) == 8, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue2) == 12, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue2) == 16, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(sizeof(TestUnion) == 16, "Type TestUnion has unexpected size.");
		static_assert(alignof(TestUnion) == 8, "Type TestUnion has unexpected alignment.");
		static_assert(offsetof(TestUnion, uintType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, doubleType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, fixedSizeInt) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, structType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(sizeof(SpecialStruct) == 40, "Type SpecialStruct has unexpected size.");
		static_assert(alignof(SpecialStruct) == 8, "Type SpecialStruct has unexpected alignment.");
		static_assert(offsetof(SpecialStruct, floatPtrField) == 0, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, arrayField) == 8, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, intPtrField) == 32, "Type SpecialStruct has unexpected offset.");
		#endif // !defined(_WIN32) && ARCH_BITS == 64
		

		#if !defined(_WIN32) && defined(__i386__)
		static_assert(sizeof(ssize_t) == 4, "Type ssize_t has unexpected size.");
		static_assert(alignof(ssize_t) == 4, "Type ssize_t has unexpected alignment.");
		static_assert(sizeof(bool) == 1, "Type bool has unexpected size.");
		static_assert(alignof(bool) == 1, "Type bool has unexpected alignment.");
		static_assert(sizeof(uint64_t) == 8, "Type uint64_t has unexpected size.");
		static_assert(alignof(uint64_t) == 4, "Type uint64_t has unexpected alignment.");
		static_assert(sizeof(conditional_word_t) == 4, "Type conditional_word_t has unexpected size.");
		static_assert(alignof(conditional_word_t) == 4, "Type conditional_word_t has unexpected alignment.");
		static_assert(sizeof(signed char) == 1, "Type signed char has unexpected size.");
		static_assert(alignof(signed char) == 1, "Type signed char has unexpected alignment.");
		static_assert(sizeof(size_t) == 4, "Type size_t has unexpected size.");
		static_assert(alignof(size_t) == 4, "Type size_t has unexpected alignment.");
		static_assert(sizeof(float) == 4, "Type float has unexpected size.");
		static_assert(alignof(float) == 4, "Type float has unexpected alignment.");
		static_assert(sizeof(long) == 4, "Type long has unexpected size.");
		static_assert(alignof(long) == 4, "Type long has unexpected alignment.");
		static_assert(sizeof(intptr_t) == 4, "Type intptr_t has unexpected size.");
		static_assert(alignof(intptr_t) == 4, "Type intptr_t has unexpected alignment.");
		static_assert(sizeof(my_size_t) == 4, "Type my_size_t has unexpected size.");
		static_assert(alignof(my_size_t) == 4, "Type my_size_t has unexpected alignment.");
		static_assert(sizeof(const char) == 1, "Type const char has unexpected size.");
		static_assert(alignof(const char) == 1, "Type const char has unexpected alignment.");
		static_assert(sizeof(const size_t) == 4, "Type const size_t has unexpected size.");
		static_assert(alignof(const size_t) == 4, "Type const size_t has unexpected alignment.");
		static_assert(sizeof(double) == 8, "Type double has unexpected size.");
		static_assert(alignof(double) == 4, "Type double has unexpected alignment.");
		static_assert(sizeof(uint32_t) == 4, "Type uint32_t has unexpected size.");
		static_assert(alignof(uint32_t) == 4, "Type uint32_t has unexpected alignment.");
		static_assert(sizeof(unsigned char) == 1, "Type unsigned char has unexpected size.");
		static_assert(alignof(unsigned char) == 1, "Type unsigned char has unexpected alignment.");
		static_assert(sizeof(uintptr_t) == 4, "Type uintptr_t has unexpected size.");
		static_assert(alignof(uintptr_t) == 4, "Type uintptr_t has unexpected alignment.");
		static_assert(sizeof(int) == 4, "Type int has unexpected size.");
		static_assert(alignof(int) == 4, "Type int has unexpected alignment.");
		static_assert(sizeof(uint16_t) == 2, "Type uint16_t has unexpected size.");
		static_assert(alignof(uint16_t) == 2, "Type uint16_t has unexpected alignment.");
		static_assert(sizeof(unsigned int) == 4, "Type unsigned int has unexpected size.");
		static_assert(alignof(unsigned int) == 4, "Type unsigned int has unexpected alignment.");
		static_assert(sizeof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected size.");
		static_assert(alignof(ptrdiff_t) == 4, "Type ptrdiff_t has unexpected alignment.");
		static_assert(sizeof(char) == 1, "Type char has unexpected size.");
		static_assert(alignof(char) == 1, "Type char has unexpected alignment.");
		static_assert(sizeof(short) == 2, "Type short has unexpected size.");
		static_assert(alignof(short) == 2, "Type short has unexpected alignment.");
		static_assert(sizeof(uint8_t) == 1, "Type uint8_t has unexpected size.");
		static_assert(alignof(uint8_t) == 1, "Type uint8_t has unexpected alignment.");
		static_assert(sizeof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected size.");
		static_assert(alignof(const conditional_word_t) == 4, "Type const conditional_word_t has unexpected alignment.");
		static_assert(sizeof(GlobalArg) == 32, "Type GlobalArg has unexpected size.");
		static_assert(alignof(GlobalArg) == 4, "Type GlobalArg has unexpected alignment.");
		static_assert(offsetof(GlobalArg, longVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, shortVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, byteVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, charVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, boolVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, floatVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, doubleVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, intPtrPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, structPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumVal) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, enumPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, unionPtr) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(offsetof(GlobalArg, allArgs) == 0, "Type GlobalArg has unexpected offset.");
		static_assert(sizeof(AnonymousStructField) == 12, "Type AnonymousStructField has unexpected size.");
		static_assert(alignof(AnonymousStructField) == 4, "Type AnonymousStructField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructField, inner) == 0, "Type AnonymousStructField has unexpected offset.");
		static_assert(offsetof(AnonymousStructField, externalValue) == 8, "Type AnonymousStructField has unexpected offset.");
		static_assert(sizeof(TestStruct) == 16, "Type TestStruct has unexpected size.");
		static_assert(alignof(TestStruct) == 4, "Type TestStruct has unexpected alignment.");
		static_assert(offsetof(TestStruct, field1) == 0, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field2) == 8, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field3) == 12, "Type TestStruct has unexpected offset.");
		static_assert(offsetof(TestStruct, field4) == 14, "Type TestStruct has unexpected offset.");
		static_assert(sizeof(AnonymousClosure) == 8, "Type AnonymousClosure has unexpected size.");
		static_assert(alignof(AnonymousClosure) == 4, "Type AnonymousClosure has unexpected alignment.");
		static_assert(offsetof(AnonymousClosure, someClosure) == 0, "Type AnonymousClosure has unexpected offset.");
		static_assert(offsetof(AnonymousClosure, anotherClosure) == 4, "Type AnonymousClosure has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldEnd) == 12, "Type AnonymousStructNoFieldEnd has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldEnd) == 4, "Type AnonymousStructNoFieldEnd has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, externalValue) == 0, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, intValue) == 4, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldEnd, floatValue) == 8, "Type AnonymousStructNoFieldEnd has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoField) == 12, "Type AnonymousStructNoField has unexpected size.");
		static_assert(alignof(AnonymousStructNoField) == 4, "Type AnonymousStructNoField has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoField, intValue) == 0, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, floatValue) == 4, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoField, externalValue) == 8, "Type AnonymousStructNoField has unexpected offset.");
		static_assert(sizeof(WordStruct) == 20, "Type WordStruct has unexpected size.");
		static_assert(alignof(WordStruct) == 4, "Type WordStruct has unexpected alignment.");
		static_assert(offsetof(WordStruct, tag) == 0, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, count) == 4, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, delta) == 8, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, address) == 12, "Type WordStruct has unexpected offset.");
		static_assert(offsetof(WordStruct, aliased) == 16, "Type WordStruct has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldNested) == 12, "Type AnonymousStructNoFieldNested has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldNested) == 4, "Type AnonymousStructNoFieldNested has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldNested, intValue1) == 0, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, floatValue2) == 4, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldNested, externalValue) == 8, "Type AnonymousStructNoFieldNested has unexpected offset.");
		static_assert(sizeof(AnonymousStructFieldArray) == 20, "Type AnonymousStructFieldArray has unexpected size.");
		static_assert(alignof(AnonymousStructFieldArray) == 4, "Type AnonymousStructFieldArray has unexpected alignment.");
		static_assert(offsetof(AnonymousStructFieldArray, inner) == 0, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(offsetof(AnonymousStructFieldArray, externalValue) == 16, "Type AnonymousStructFieldArray has unexpected offset.");
		static_assert(sizeof(AnonymousStructNoFieldConsecutive) == 20, "Type AnonymousStructNoFieldConsecutive has unexpected size.");
		static_assert(alignof(AnonymousStructNoFieldConsecutive) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected alignment.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, externalValue) == 0, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue1) == 4, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue1) == 8, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, intValue2) == 12, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(offsetof(AnonymousStructNoFieldConsecutive, floatValue2) == 16, "Type AnonymousStructNoFieldConsecutive has unexpected offset.");
		static_assert(sizeof(TestUnion) == 16, "Type TestUnion has unexpected size.");
		static_assert(alignof(TestUnion) == 4, "Type TestUnion has unexpected alignment.");
		static_assert(offsetof(TestUnion, uintType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, doubleType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, fixedSizeInt) == 0, "Type TestUnion has unexpected offset.");
		static_assert(offsetof(TestUnion, structType) == 0, "Type TestUnion has unexpected offset.");
		static_assert(sizeof(SpecialStruct) == 28, "Type SpecialStruct has unexpected size.");
		static_assert(alignof(SpecialStruct) == 4, "Type SpecialStruct has unexpected alignment.");
		static_assert(offsetof(SpecialStruct, floatPtrField) == 0, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, arrayField) == 4, "Type SpecialStruct has unexpected offset.");
		static_assert(offsetof(SpecialStruct, intPtrField) == 24, "Type SpecialStruct has unexpected offset.");
		#endif // !defined(_WIN32) && defined(__i386__)
		

		static_assert(IS_SIGNED_TYPE(ssize_t), "Type ssize_t is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(bool), "Type bool is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(uint64_t), "Type uint64_t is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(conditional_word_t), "Type conditional_word_t is expected unsigned.");
		static_assert(IS_SIGNED_TYPE(signed char), "Type signed char is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(size_t), "Type size_t is expected unsigned.");
		static_assert(IS_SIGNED_TYPE(float), "Type float is expected signed.");
		static_assert(IS_SIGNED_TYPE(long), "Type long is expected signed.");
		static_assert(IS_SIGNED_TYPE(intptr_t), "Type intptr_t is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(my_size_t), "Type my_size_t is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(const size_t), "Type const size_t is expected unsigned.");
		static_assert(IS_SIGNED_TYPE(double), "Type double is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(uint32_t), "Type uint32_t is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(unsigned char), "Type unsigned char is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(uintptr_t), "Type uintptr_t is expected unsigned.");
		static_assert(IS_SIGNED_TYPE(int), "Type int is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(uint16_t), "Type uint16_t is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(unsigned int), "Type unsigned int is expected unsigned.");
		static_assert(IS_SIGNED_TYPE(ptrdiff_t), "Type ptrdiff_t is expected signed.");
		static_assert(IS_SIGNED_TYPE(short), "Type short is expected signed.");
		static_assert(IS_UNSIGNED_TYPE(uint8_t), "Type uint8_t is expected unsigned.");
		static_assert(IS_UNSIGNED_TYPE(const conditional_word_t), "Type const conditional_word_t is expected unsigned.");
*/
    public static void init() {
    }

    private final static HashMap<Integer, CTypeInfo> ffiIdMap = new HashMap<>();

    public static CTypeInfo getCTypeInfo(int id) {
        return ffiIdMap.get(id);
    }

    /*JNI
static native_type* getNativeType(int id) {
native_type* nativeType = (native_type*)malloc(sizeof(native_type));
switch(id) {
	case -2:
		nativeType->type = VOID_TYPE;
		return nativeType;
	case -1:
		nativeType->type = POINTER_TYPE;
		return nativeType;
	case 0:
		GET_NATIVE_TYPE(bool, nativeType);
		return nativeType;
	case 1:
		GET_NATIVE_TYPE(char, nativeType);
		return nativeType;
	case 2:
		GET_NATIVE_TYPE(conditional_word_t, nativeType);
		return nativeType;
	case 3:
		GET_NATIVE_TYPE(const char, nativeType);
		return nativeType;
	case 4:
		GET_NATIVE_TYPE(const conditional_word_t, nativeType);
		return nativeType;
	case 5:
		GET_NATIVE_TYPE(const size_t, nativeType);
		return nativeType;
	case 6:
		GET_NATIVE_TYPE(double, nativeType);
		return nativeType;
	case 7:
		GET_NATIVE_TYPE(float, nativeType);
		return nativeType;
	case 8:
		GET_NATIVE_TYPE(int, nativeType);
		return nativeType;
	case 9:
		GET_NATIVE_TYPE(intptr_t, nativeType);
		return nativeType;
	case 10:
		GET_NATIVE_TYPE(long, nativeType);
		return nativeType;
	case 11:
		GET_NATIVE_TYPE(my_size_t, nativeType);
		return nativeType;
	case 12:
		GET_NATIVE_TYPE(ptrdiff_t, nativeType);
		return nativeType;
	case 13:
		GET_NATIVE_TYPE(short, nativeType);
		return nativeType;
	case 14:
		GET_NATIVE_TYPE(signed char, nativeType);
		return nativeType;
	case 15:
		GET_NATIVE_TYPE(size_t, nativeType);
		return nativeType;
	case 16:
		GET_NATIVE_TYPE(ssize_t, nativeType);
		return nativeType;
	case 17:
		GET_NATIVE_TYPE(uint16_t, nativeType);
		return nativeType;
	case 18:
		GET_NATIVE_TYPE(uint32_t, nativeType);
		return nativeType;
	case 19:
		GET_NATIVE_TYPE(uint64_t, nativeType);
		return nativeType;
	case 20:
		GET_NATIVE_TYPE(uint8_t, nativeType);
		return nativeType;
	case 21:
		GET_NATIVE_TYPE(uintptr_t, nativeType);
		return nativeType;
	case 22:
		GET_NATIVE_TYPE(unsigned char, nativeType);
		return nativeType;
	case 23:
		GET_NATIVE_TYPE(unsigned int, nativeType);
		return nativeType;
	case 24:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(-1);
		return nativeType;
	case 25:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(40);
		nativeType->fields[1] = getNativeType(8);
		return nativeType;
	case 26:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(41);
		nativeType->fields[1] = getNativeType(41);
		nativeType->fields[2] = getNativeType(8);
		return nativeType;
	case 27:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(7);
		nativeType->fields[2] = getNativeType(8);
		return nativeType;
	case 28:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(7);
		nativeType->fields[3] = getNativeType(8);
		nativeType->fields[4] = getNativeType(7);
		return nativeType;
	case 29:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(7);
		return nativeType;
	case 30:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 3;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 3);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(7);
		nativeType->fields[2] = getNativeType(8);
		return nativeType;
	case 31:
		{
			size_t __blockAlign = alignof(FILE);
			if (__blockAlign > 8) __blockAlign = 8;
			int __blockCount = (int)(sizeof(FILE) / __blockAlign);
			nativeType->type = STRUCT_TYPE;
			nativeType->field_count = __blockCount;
			nativeType->fields = (native_type**)malloc(sizeof(native_type*) * __blockCount);
			for (int __blockIndex = 0; __blockIndex < __blockCount; __blockIndex++) {
				nativeType->fields[__blockIndex] = (native_type*)malloc(sizeof(native_type));
				set_native_type(nativeType->fields[__blockIndex], INT_TYPE, __blockAlign, false);
			}
			return nativeType;
		}
	case 32:
		nativeType->type = UNION_TYPE;
		nativeType->field_count = 16;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 16);
		nativeType->fields[0] = getNativeType(19);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(13);
		nativeType->fields[3] = getNativeType(1);
		nativeType->fields[4] = getNativeType(17);
		nativeType->fields[5] = getNativeType(0);
		nativeType->fields[6] = getNativeType(7);
		nativeType->fields[7] = getNativeType(6);
		nativeType->fields[8] = getNativeType(-1);
		nativeType->fields[9] = getNativeType(-1);
		nativeType->fields[10] = getNativeType(34);
		nativeType->fields[11] = getNativeType(-1);
		nativeType->fields[12] = getNativeType(23);
		nativeType->fields[13] = getNativeType(-1);
		nativeType->fields[14] = getNativeType(-1);
		nativeType->fields[15] = getNativeType(38);
		return nativeType;
	case 33:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 7;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 7);
		nativeType->fields[0] = getNativeType(-1);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(8);
		nativeType->fields[3] = getNativeType(8);
		nativeType->fields[4] = getNativeType(8);
		nativeType->fields[5] = getNativeType(8);
		nativeType->fields[6] = getNativeType(-1);
		return nativeType;
	case 34:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 4;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 4);
		nativeType->fields[0] = getNativeType(19);
		nativeType->fields[1] = getNativeType(18);
		nativeType->fields[2] = getNativeType(17);
		nativeType->fields[3] = getNativeType(20);
		return nativeType;
	case 35:
		nativeType->type = UNION_TYPE;
		nativeType->field_count = 6;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 6);
		nativeType->fields[0] = getNativeType(19);
		nativeType->fields[1] = getNativeType(6);
		nativeType->fields[2] = getNativeType(8);
		nativeType->fields[3] = getNativeType(8);
		nativeType->fields[4] = getNativeType(8);
		nativeType->fields[5] = getNativeType(34);
		return nativeType;
	case 36:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(42);
		nativeType->fields[1] = getNativeType(8);
		return nativeType;
	case 37:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 5;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 5);
		nativeType->fields[0] = getNativeType(20);
		nativeType->fields[1] = getNativeType(15);
		nativeType->fields[2] = getNativeType(16);
		nativeType->fields[3] = getNativeType(9);
		nativeType->fields[4] = getNativeType(11);
		return nativeType;
	case 38:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 8;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 8);
		nativeType->fields[0] = getNativeType(19);
		nativeType->fields[1] = getNativeType(8);
		nativeType->fields[2] = getNativeType(13);
		nativeType->fields[3] = getNativeType(1);
		nativeType->fields[4] = getNativeType(17);
		nativeType->fields[5] = getNativeType(0);
		nativeType->fields[6] = getNativeType(7);
		nativeType->fields[7] = getNativeType(6);
		return nativeType;
	case 40:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(7);
		return nativeType;
	case 41:
		nativeType->type = STRUCT_TYPE;
		nativeType->field_count = 2;
		nativeType->fields = (native_type**)malloc(sizeof(native_type*) * 2);
		nativeType->fields[0] = getNativeType(8);
		nativeType->fields[1] = getNativeType(7);
		return nativeType;
	case 42:
		{
			size_t __blockAlign = alignof(struct timespec);
			if (__blockAlign > 8) __blockAlign = 8;
			int __blockCount = (int)(sizeof(struct timespec) / __blockAlign);
			nativeType->type = STRUCT_TYPE;
			nativeType->field_count = __blockCount;
			nativeType->fields = (native_type**)malloc(sizeof(native_type*) * __blockCount);
			for (int __blockIndex = 0; __blockIndex < __blockCount; __blockIndex++) {
				nativeType->fields[__blockIndex] = (native_type*)malloc(sizeof(native_type));
				set_native_type(nativeType->fields[__blockIndex], INT_TYPE, __blockAlign, false);
			}
			return nativeType;
		}
	default:
		free(nativeType);
		return NULL;
	}
}
*/
    private native static long getNativeType(int id);/*
    	return reinterpret_cast<jlong>(getNativeType(id));
    */

    private native static void freeNativeType(long nativeType);/*
    	free_native_type((native_type*)nativeType);
    */

    private static void registerCTypeInfo(int id) {
        long nativeType = getNativeType(id);
        ffiIdMap.put(id, CHandler.constructCTypeFromNativeType(nativeType));
        freeNativeType(nativeType);
    }

    static {
        registerCTypeInfo(-2);
        registerCTypeInfo(-1);
        registerCTypeInfo(0);
        registerCTypeInfo(1);
        registerCTypeInfo(2);
        registerCTypeInfo(3);
        registerCTypeInfo(4);
        registerCTypeInfo(5);
        registerCTypeInfo(6);
        registerCTypeInfo(7);
        registerCTypeInfo(8);
        registerCTypeInfo(9);
        registerCTypeInfo(10);
        registerCTypeInfo(11);
        registerCTypeInfo(12);
        registerCTypeInfo(13);
        registerCTypeInfo(14);
        registerCTypeInfo(15);
        registerCTypeInfo(16);
        registerCTypeInfo(17);
        registerCTypeInfo(18);
        registerCTypeInfo(19);
        registerCTypeInfo(20);
        registerCTypeInfo(21);
        registerCTypeInfo(22);
        registerCTypeInfo(23);
        registerCTypeInfo(24);
        registerCTypeInfo(25);
        registerCTypeInfo(26);
        registerCTypeInfo(27);
        registerCTypeInfo(28);
        registerCTypeInfo(29);
        registerCTypeInfo(30);
        registerCTypeInfo(31);
        registerCTypeInfo(32);
        registerCTypeInfo(33);
        registerCTypeInfo(34);
        registerCTypeInfo(35);
        registerCTypeInfo(36);
        registerCTypeInfo(37);
        registerCTypeInfo(38);
        registerCTypeInfo(40);
        registerCTypeInfo(41);
        registerCTypeInfo(42);
    }
}
