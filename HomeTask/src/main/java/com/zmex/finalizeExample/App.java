package com.zmex.finalizeExample;

import com.zmex.finalizeExample.person.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static List<Person> persons = new ArrayList<Person>();

  public static void main(String[] args) {
    testGCLaunch();
    System.out.println("Created persons counter " + Person.getCreatedPersonsCounter());
    System.out.println("Finalize method was called " + Person.getFinalizeCounter() + " times");
    System.out.println("Add person was called " + Person.getAddingCounter() + " times");
    System.out.println("Persons in list : " + persons.size());
  }

  public static void testGCLaunch() {
    for (int i = 0; i < 1000; i++) {
      new Person();
    }
    Runtime.getRuntime().gc();
  }
}
