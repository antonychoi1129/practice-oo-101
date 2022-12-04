package com.oo101;

public class Driver {
    private final Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void speedUp(){
        this.vehicle.speedUp();
    }
}
