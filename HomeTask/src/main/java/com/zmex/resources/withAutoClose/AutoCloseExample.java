package com.zmex.resources.withAutoClose;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AutoCloseExample {
	private static final String fileName = "src/resourses/settings.txt";

	public static List<String> readFile() {
		List<String> settings = new ArrayList<>();
		String line = null;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			while ((line = bufferedReader.readLine()) != null) {
				settings.add(line);
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("File not found...");
		} catch (IOException e) {
			System.out.println("Error wile reading file");
			e.printStackTrace();
		}
		return settings;
	}

}
