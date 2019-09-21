package com.zmex.homeTask.person;

public class Person {
    
    public Person() {
	System.out.println("Person created");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person deleted");
    }

}
