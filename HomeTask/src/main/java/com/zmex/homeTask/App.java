package com.zmex.homeTask;

import com.zmex.homeTask.person.Person;

public class App {

    private static long usedMemory;
    private static long cleanedMemory;

    public static void main(String[] args) {

    }

    public static void testGCLaunch() {
	long beforeCycle = Runtime.getRuntime().freeMemory();

	for (int i = 0; i < 100000; i++) {
	    new Person();
	}

	long beforeGC = Runtime.getRuntime().freeMemory();

	Runtime.getRuntime().gc();

	long afterGC = Runtime.getRuntime().freeMemory();

	usedMemory = beforeCycle - beforeGC;

	cleanedMemory = beforeGC - afterGC;

	System.out.println("Used memory " + usedMemory);
	System.out.println("Cleaned memory " + cleanedMemory);

    }

}
