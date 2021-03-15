package com.sda.zoo;

public class Eagle extends Animal implements FlyBehavior, RunBehaviour {

    @Override
    public void fly(double height) {
        System.out.println("Eagle flying at " + height);
    }

    @Override
    public void eat(String something) {
        System.out.println("Eagle is eating " + something);
    }

    @Override
    public String run(double speed) {
        double endSpeed = speed;
        if (speed > 5) {
            endSpeed = 5;
        }
        System.out.println("I run " + endSpeed + " km/h");
        return null;
    }

    @Override
    public String toString() {
        return "Eagle{}";
    }
}
