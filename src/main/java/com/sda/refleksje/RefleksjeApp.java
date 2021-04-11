package com.sda.refleksje;

import com.sda.vehicles.Car;

import java.lang.reflect.Method;
import java.util.Arrays;

public class RefleksjeApp {
    public static void main(String[] args) throws Exception{
        Class<Car> klasaCar = Car.class;
        Method[] methods = klasaCar.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        Car car = new Car();
        Method runMethod = klasaCar.getDeclaredMethod("run", double.class);
        runMethod.invoke(car, 180d);

    }
}
