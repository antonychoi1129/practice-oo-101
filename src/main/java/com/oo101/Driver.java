package com.oo101;

public class Driver {
    private Vehicles vehicles;

    public Driver(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public String speedUp(){
        return vehicles.speedUp();
    }
}
