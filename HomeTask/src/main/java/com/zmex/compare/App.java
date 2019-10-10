package com.zmex.compare;

import com.zmex.compare.factory.Car;
import com.zmex.compare.factory.CarFactory;

import java.util.Collections;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Car> cars = CarFactory.buildRandomCars(100, 200, 150);
    Collections.sort(cars);
    cars.forEach(x -> System.out.println(x.getMaxSpeed()));
  }
}
