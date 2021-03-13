package com.sda.vehicles;

public class Motorcycle extends Vehicle{
    public Motorcycle() {
        super(2);
        System.out.println("Tworzenie motocykla.");
    }

    @Override
    public void run (double velocity){
        System.out.println("Motocycle running at " + velocity);
    }
}
