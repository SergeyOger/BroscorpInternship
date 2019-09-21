package com.zmex.home.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OverflowTest {

    @Test
    @DisplayName("Test byte overflow")
    void testByteOverflow() {
	byte b = (byte) (Byte.MAX_VALUE + 1);
	assertEquals(b, Byte.MIN_VALUE);
    }

    @Test
    @DisplayName("Test short overflow")
    void testShortOverflow() {
	short s = (short) (Short.MAX_VALUE + 1);
	assertEquals(s, Short.MIN_VALUE);
    }

    @Test
    @DisplayName("Test int overflow")
    void testIntOverflow() {
	int i = (int) (Integer.MAX_VALUE + 1);
	assertEquals(i, Integer.MIN_VALUE);
    }

    @Test
    @DisplayName("Test long overflow")
    void testLongOverflow() {
	long l = (long) (Long.MAX_VALUE + 1);
	assertEquals(l, Long.MIN_VALUE);
    }

}
