package com.zmex.resources.withFinally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinallyBlockExample {

    private static final String fileName = "src/resourses/settings.txt";

    public static List<String> readFile() {
	List<String> settings = new ArrayList<>();
	BufferedReader bufferedReader = null;
	String line = null;
	try {
	    bufferedReader = new BufferedReader(new FileReader(fileName));
	    while ((line = bufferedReader.readLine()) != null) {
		settings.add(line);
	    }
	} catch (FileNotFoundException fileNotFoundException) {
	    System.out.println("File not found...");
	} catch (IOException e) {
	    System.out.println("Error wile reading file");
	    e.printStackTrace();
	} finally {
	    try {
		if (bufferedReader != null) {
		    bufferedReader.close();
		}
	    } catch (IOException e) {
		System.out.println("Erorr while closing reader");
		e.printStackTrace();
	    }
	}
	return settings;
    }

}
