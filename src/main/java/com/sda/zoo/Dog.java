package com.sda.zoo;

public class Dog extends Animal implements RunBehaviour{
    @Override
    void eat(String something) {
        System.out.println("Dog is eating" + something);
    }

    @Override
    public String run(double speed) {
        System.out.println("Dog run at " + speed + "km/h");
        return null;
    }
}
