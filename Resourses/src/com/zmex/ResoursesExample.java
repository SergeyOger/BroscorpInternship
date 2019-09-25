package com.zmex;

import java.util.List;

import com.zmex.withAutoClose.AutoCloseExample;
import com.zmex.withFinally.FinallyBlockExample;

public class ResoursesExample {

    public static void main(String[] args) {
	List<String> settings = AutoCloseExample.readFile();
	settings.forEach(x -> System.out.println(x));
    }

}
