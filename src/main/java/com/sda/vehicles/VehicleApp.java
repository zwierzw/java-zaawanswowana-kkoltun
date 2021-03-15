package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.run(13);
//
//        Car car = new Car();
//        car.run(120);
//
//        car.addPassenger();
//        car.addPassenger();
//
//        car.removePassengers();
//
//        Motorcycle motorcycle = new Motorcycle();

//        Vehicle vehicle2 = new Vehicle(4);
//        vehicle2.run(68);
//
//        vehicle2 = new Car();
//        vehicle2.run(100);
//
//        vehicle2 = new Motorcycle();
//        vehicle2.run(150);

        Vehicle vehicle = new Vehicle(4);
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        runThisVehicle(vehicle);
        runThisVehicle(car);
        runThisVehicle(motorcycle);


        ConvertibleCar convertibleCar = new ConvertibleCar();
        convertibleCar.openRoof(true);
        convertibleCar.openRoof(false);
        convertibleCar.closeRoof(false);
        convertibleCar.closeRoof(true);


        System.out.println(car.toString());
        car.addPassenger();
        System.out.println(car.toString());
        car.addPassenger();
        car.addPassenger();
        car.removePassengers();
        car.removePassengers();
        car.removePassengers();
        car.removePassengers();
        car.removePassengers();

    }


    private static void runThisVehicle(Vehicle vehicle) {
        vehicle.run(100);
    }



}
