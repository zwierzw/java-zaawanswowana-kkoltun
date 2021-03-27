package com.sda.generic.road;

import com.sda.vehicles.Car;
import com.sda.vehicles.Motorcycle;

public class RoadApp {
    public static void main(String[] args) {
    Road<Car> carRoad = new Road<>(new Car());
    carRoad.getT();
    carRoad.runThisVehicle(123);

    Car car = carRoad.getT();
    car.addPassenger();

    Road<Motorcycle> motorcycleRoad = new Road<>(new Motorcycle());
    motorcycleRoad.getT();
    motorcycleRoad.runThisVehicle(234);

    //Błąd poniżej! Nie możesz dać surowej klasy.
    Road road = new Road();
    road.runThisVehicle(123);





//        Road<String> stringRoad = new Road<>();
//        stringRoad.setT("Marszłkowska");
//        String street = stringRoad.getT();
//        System.out.println(street);
//
//        Road<Integer> integerRoad = new Road<>();
//        integerRoad.setT(1234);
//        int number = integerRoad.getT();
//        System.out.println(integerRoad.getT());
//
//        Road<Boolean> booleanRoad = new Road<>();
//        booleanRoad.setT(true);
//        boolean isCorrect = booleanRoad.getT();
//        System.out.println(isCorrect);
//
//        // ŻLE!uŻYCIE SUROWEGO TYPU ROAD, RZUTOWANIE
//        Road rawRoad = new Road();
//        rawRoad.setT("Marszałkowska");
//        rawRoad.setT(1234);
//
//        Object rawRoadItem = rawRoad.getT();
//        //Wywali się w runtime, nie jest sprawdzane przy kompilacji
//        Integer integer = (Integer) rawRoadItem;
//



    }
}
