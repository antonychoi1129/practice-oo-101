package com.oo101;

public class Main {
    public static void main(String[] args) {
        Vehicles coolCar = new Car("Cool Car", 30);
        Vehicles bigTruck = new Truck("Big Truck", 15);
        Driver driver = new Driver(coolCar);
        Driver driver1 = new Driver(bigTruck);
        System.out.println(coolCar.speedUp());
        System.out.println(bigTruck.speedUp());
        System.out.println(driver.speedUp());
        System.out.println(driver1.speedUp());
    }
}
