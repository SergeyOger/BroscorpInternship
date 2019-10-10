package com.zmex.list;

import com.zmex.customList.list.CustomList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomListTest {
  static CustomList<Integer> list;

  @BeforeEach
  void initList() {
    list = new CustomList<>();
  }

  @AfterAll
  static void cleanList() {
    list = null;
  }

  @Test
  @DisplayName("Test add method")
  void testAddMethod() {
    assertTrue(list.add(1));
  }

  @Test
  @DisplayName("Test size method")
  void testSizeMethod() {
    for (int i = 0; i < 20; i++) {
      list.add(i);
    }
    assertTrue(list.size() == 20);
  }

  @Test
  @DisplayName("Test get method")
  void testGetMethod() {
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    assertTrue(list.get(6) == 6);
  }

  @Test
  @DisplayName("Test remove method")
  void testRemoveMethod() {
    for (int i = 0; i < 30; i++) {
      list.add(i);
    }
    assertTrue(list.remove(10) == 10);
  }

  @Test
  @DisplayName("Test map method")
  void testMapMethod() {
    list.add(1);
    assertTrue(Double.class.equals(list.map(x -> x + 0.3).get(0).getClass()));
  }
}
