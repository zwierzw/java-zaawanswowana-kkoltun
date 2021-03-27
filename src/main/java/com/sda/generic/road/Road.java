package com.sda.generic.road;

import com.sda.vehicles.Vehicle;

public class Road <T extends Vehicle> {
    private T t;

    public Road(T t) {
        this.t = t;
    }

    public Road() {
    }

    public void runThisVehicle (double speed){
        t.run(speed);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
