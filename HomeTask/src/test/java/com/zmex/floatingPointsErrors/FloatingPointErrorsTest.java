package com.zmex.floatingPointsErrors;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FloatingPointErrorsTest {

	@Test
	@DisplayName("Float accuracy error test")
	void testFloatAccuracy() {
		float num1 = 0.1f;
		float num2 = 0.1f;
		float num3 = 0.1f;
		float result = (num1 + num2 + num3) * 3 * 1000;
		assertFalse(result == 900);
	}

	@Test
	@DisplayName("Double accuracy error test")
	void testDoubleAccuracy() {
		double num1 = 0.1;
		double num2 = 0.1;
		double num3 = 0.1;
		double result = (num1 + num2 + num3) * 3 * 1000;
		assertFalse(result == 900);
	}
}
