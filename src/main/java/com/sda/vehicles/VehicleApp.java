package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run(13);

        Car car = new Car();
        car.run(120);

        car.addPassenger();
        car.addPassenger();

        car.removePassengers();

        Motorcycle motorcycle = new Motorcycle();

        Vehicle vehicle2 = new Vehicle(4);
        vehicle2 = new Car();
        vehicle2.run(100);

        vehicle2 = new Motorcycle();
        vehicle2.run(150);
    }
}
