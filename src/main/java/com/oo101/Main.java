package com.oo101;

public class Main {
    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car", new Gasoline());
        Driver carDriver = new Driver(coolCar);
        carDriver.speedUp();

        Truck bigTruck = new Truck("Big Truck", 10);
        Driver truckDriver = new Driver(bigTruck);
        truckDriver.speedUp();
    }
}
