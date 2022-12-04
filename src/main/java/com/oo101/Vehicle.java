package com.oo101;

public class Vehicle {
    final String name;
    final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        System.out.println(this.name + ": speed up " + this.speed + " km/h");
    }
}
