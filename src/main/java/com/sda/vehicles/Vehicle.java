package com.sda.vehicles;

public class Vehicle {
    private int wheels;

    public void run(double velocity) {
        System.out.println("Vehicle running at " + velocity);
    }


    public Vehicle() {
        wheels = 4;
        System.out.println("Tworzony jest Vehicle z " + wheels + "kołami");
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Tworzony jest Vehicle z " + wheels + "kołami");
    }

    public int getWheels() {
        return wheels;
    }
}
