package com.zmex.compare.factory;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> buildRandomCars(int minSpeed, int maxSpeed, int amount) {
	List<Car> cars = new ArrayList<Car>();

	for (int i = 0; i < amount; i++) {
	    int speedValue = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
	    Car car = new Car(speedValue);
	    cars.add(car);
	}
	return cars;
    }

}
