package com.sda.zoo;

public class Duck extends Animal implements FlyBehavior, RunBehaviour {

    @Override
    public void fly(double height) {
        double actualHeight;
        if (height > 100) {
            actualHeight = 100;
        } else {
            actualHeight = height;
        }
        System.out.println("Kaczka leci na wysokości " + actualHeight);
    }

    @Override
    public void eat(String something) {
        System.out.println("Duck is eating " + something);
    }

    @Override
    public String run(double speed) {
        double endSpeed = speed;
        if (speed > 20) {
            endSpeed = 20;
        }
        System.out.println("I run " + endSpeed + " km/h");
        return null;
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}