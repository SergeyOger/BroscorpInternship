package com.zmex.resources;

import java.util.List;

import com.zmex.resources.withAutoClose.AutoCloseExample;
import com.zmex.resources.withFinally.FinallyBlockExample;

public class ResoursesExample {

	public static void main(String[] args) {
		List<String> settings = AutoCloseExample.readFile();
		settings.forEach(x -> System.out.println(x));
	}

}
