package com.sda.zoo;

public class Duck implements FlyBehavior {

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

}