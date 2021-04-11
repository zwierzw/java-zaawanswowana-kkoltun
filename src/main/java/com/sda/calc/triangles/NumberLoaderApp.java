package com.sda.calc.triangles;

public class NumberLoaderApp {
    public static void main(String[] args) {
        try {
            int number = NumberLoader.loadFromUser();
            System.out.println("Loaded: " + number);
        } catch (InvalidInputException e) {
            System.out.println("Wystąpił błąd: ");
        }
    }
}
