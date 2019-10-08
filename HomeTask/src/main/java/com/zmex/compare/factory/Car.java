package com.zmex.compare.factory;

public class Car implements Comparable<Car> {
	private int maxSpeed;

	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public int compareTo(Car o) {
		return o.getMaxSpeed() - maxSpeed;
	}

}
