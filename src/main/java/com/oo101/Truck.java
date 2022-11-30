package com.oo101;

public class Truck implements Vehicles {
    private String name;
    private int speed;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedUp(){
        return String.format("%s: speed up %d km/h", name, speed);
    }
}
