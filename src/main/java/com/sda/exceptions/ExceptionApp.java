package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {
        greet("Jacek");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write your name:");
            String text = scanner.nextLine();
            greet(text);
        } catch (IllegalArgumentException exception){
            System.out.println("Pojawił się wyjątek "+ exception.getMessage() +".Proszę podaj imię!");
        }

        System.out.println("Zamykam program.");
    }

    static void greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }
        System.out.println("Hello " + name);
    }

}
