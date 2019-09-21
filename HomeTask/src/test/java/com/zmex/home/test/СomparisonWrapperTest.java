package com.zmex.home.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ÑomparisonWrapperTest {

    @Test
    @DisplayName("Test primitive type comparison")
    void testPrimitiveComparison() {
	int x = 1;
	int y = 1;
	assertTrue(x == y);
    }

    @Test
    @DisplayName("Test fail wrapper type comparison")
    void testFailWrapperComparison() {
	Integer firstNumber = new Integer(2);
	Integer secondNumber = new Integer(2);
	assertFalse(firstNumber == secondNumber);
    }

    @Test
    @DisplayName("Test wrapper type comparison")
    void testWrapperComparison() {
	Integer firstNumber = new Integer(2);
	Integer secondNumber = new Integer(2);
	assertTrue(firstNumber.equals(secondNumber));
    }

}
