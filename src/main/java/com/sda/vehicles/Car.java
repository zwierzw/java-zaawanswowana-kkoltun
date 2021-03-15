package com.sda.vehicles;

public class Car extends Vehicle {
    private int passengers = 2;

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }

    @Override
    public void run(double velocity) {
        System.out.println("Car with " + passengers + " passengers running at " + velocity);
    }

    public void addPassenger() {
        if (passengers >= 4) {
            System.out.println("Pasażerów nie może być więcej niż 4");
        } else {
            passengers += 1;
            System.out.println("Aktualnie liczbę pasażerów zwiększono do: " + passengers);
        }
    }

    public void removePassengers() {

        if (passengers <= 0) {
            System.out.println("Pasażerów nie może być mniej niż zero");
        } else {
            passengers -= 1;
            System.out.println("Aktualnie liczbę pasażerów zmniejszono do: " + passengers);
        }
    }


    public Car() {
        System.out.println("powstaje Car");
    }
}
