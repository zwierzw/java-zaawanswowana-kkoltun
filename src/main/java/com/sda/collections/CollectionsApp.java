package com.sda.collections;

import com.sda.vehicles.Car;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Kowalski");
        teachers.add("Nowak");
        teachers.add("Korek");
        teachers.add("Korek");

        for (String imie : teachers) {
            System.out.println(imie);
        }
        for (int i = 0; i < teachers.size(); ++i) {
            System.out.println(teachers.get(i));
        }


        System.out.println(teachers.toString());

        Set<Integer> points = new HashSet<>();
        points.add(12);
        points.add(23);
        points.add(20);
        points.add(12);

        for (Integer point : points) {
            System.out.println(point);
        }


        System.out.println(points.toString());

        //Map
        Map<String, String> people = new HashMap<>();
        people.put("Karol", "programista");
        people.put("Ola", "socjolożka");
        people.put("Józef", "kierowca");

        //iterowanie po kluczach
        for (String name : people.keySet()) {
            System.out.println(name);
            System.out.println("Praca " + name + " to jest " + people.get(name));
        }

        //iterowanie po wartościach
        for (String job : people.values()) {
            System.out.println(job);
        }

        //iterowanie po parach
        for (Map.Entry<String, String> pair : people.entrySet()) {
            System.out.println("Imię " + pair.getKey() + "; zawód " + pair.getValue());
        }

        String pracaOli = people.get("Ola");
        System.out.println(pracaOli);

        System.out.println(people);

    }
}
