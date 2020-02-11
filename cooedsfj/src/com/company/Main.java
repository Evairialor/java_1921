package com.company;

import ru.test.Car;

public class Main extends Car {
    public static void main(String[] args) {
        Car car = new Car();
        int maxSpeed = car.getMaxSpeed();
        System.out.println("maxSpeed: " + maxSpeed);
        Car newCar = new Car("my model", 250, 1970, 60);
        int newMaxSpeed = newCar.getMaxSpeed();
        System.out.println("maxSpeed: " + newMaxSpeed);
    }
}
