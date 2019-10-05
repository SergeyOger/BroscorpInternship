package com.zmex.list;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.zmex.customList.list.CustomList;

class CustomListTest {
    CustomList<Integer> list;

    @BeforeEach
    void initList() {
	list = new CustomList<>();
    }

    @Test
    @DisplayName("Testing add method")
    void testAddMethod() {
	assertTrue(list.add(1));
    }

    @Test
    @DisplayName("Testing size method")
    void testSizeMethod() {
	for (int i = 0; i < 20; i++) {
	    list.add(i);
	}
	assertTrue(list.size() == 20);
    }

    @Test
    @DisplayName("Testing get method")
    void testGetMehod() {
	for (int i = 0; i < 10; i++) {
	    list.add(i);
	}

	assertTrue(list.get(6) == 6);
    }

    @Test
    @DisplayName("Testing remove method")
    void testRemoveMethod() {
	for (int i = 0; i < 30; i++) {
	    list.add(i);
	}
	assertTrue(list.remove(10) == 10);
    }

}
