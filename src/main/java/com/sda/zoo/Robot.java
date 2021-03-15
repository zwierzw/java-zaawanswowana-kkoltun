package com.sda.zoo;

public class Robot implements RunBehaviour {
    @Override
    public String run(double speed) {
        System.out.println("Robot run at " + speed + "km/h");
        return null;
    }
}
