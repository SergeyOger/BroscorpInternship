package com.zmex.finalizeExample.person;

import com.zmex.finalizeExample.App;

public class Person {
    private static int finalizeCounter;
    private static int addingCounter;
    private static int createdPersonsCounter;

    public Person() {
	createdPersonsCounter++;
    }

    public static int getFinalizeCounter() {
	return finalizeCounter;
    }

    public static int getAddingCounter() {
	return addingCounter;
    }

    public static int getCreatedPersonsCounter() {
	return createdPersonsCounter;
    }

    @Override
    protected void finalize() throws Throwable {
	finalizeCounter++;
	App.persons.add(this);
	addingCounter++;
    }
}
