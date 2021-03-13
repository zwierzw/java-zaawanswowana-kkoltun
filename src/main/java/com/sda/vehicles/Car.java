package com.sda.vehicles;

public class Car extends Vehicle {
    private int passengers;

    @Override
    public void run(double velocity) {
        System.out.println("Car with " + passengers + " passengers running at " + velocity);
    }

    public void addPassenger() {
        passengers += 1;
        System.out.println("Aktualnie liczbę pasażerów zwiększono do: " + passengers);
    }

    public void removePassengers() {
        passengers -= 1;
        System.out.println("Aktualnie liczbę pasażerów zmniejszono do: " + passengers);
    }


    public Car() {
        System.out.println("powstaje Car");
    }
}
