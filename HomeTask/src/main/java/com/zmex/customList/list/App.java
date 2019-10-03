package com.zmex.customList.list;

import java.util.Iterator;

import com.zmex.customList.list.example.CustomList;

public class App {

    public static void main(String[] args) {
	CustomList<Integer> list = new CustomList<>();
	list.add(1);
	System.out.println(list);
	list.remove(0);
	System.out.println(list);

    }

}
