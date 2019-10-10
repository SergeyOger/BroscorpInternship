package com.zmex.valueTransfer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
