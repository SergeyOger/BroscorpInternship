package com.zmex.valueTransfer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValuesTransferTest {
    static List<String> strings = new ArrayList<>(Arrays.asList("J", "a", "v", "a"));;
    static int x = 10;

    static void testTransfer(int x, List<String> list) {
	x += 20;
	list.add("Hello");
    }

    @BeforeAll
    static void initOperator() {
	testTransfer(x, strings);
    }

    @Test
    @DisplayName("Test value transfer")
    void valueTransferTest() {
	assertEquals(10, x);
    }

    @Test
    @DisplayName("Test link transfer")
    void linkTransferTest() {
	assertEquals(5, strings.size());
    }

}
