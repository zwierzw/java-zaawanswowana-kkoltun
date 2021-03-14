package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String input = scanner.nextLine();
            greet(input);
        } catch (Exception exception) {
            System.out.println("Wystąpił błąd: " + exception.getMessage());
        }
        System.out.println("Zamykam program.");
    }

    //Teraz jest checked na drugi sposób, bez łapania go
    static void greet(String name) throws Exception{ //oznaczenie metody jako rzucającej wyjątek
        if (name == null || name.isEmpty()) {
            throw new Exception("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new Exception("Imię jest zbyt krótkie");
        }
        System.out.println("Hello " + name);

    }


    // teraz jest to Checked Exception
//    static void greet(String name){
//        try {
//            if (name == null || name.isEmpty()) {
//                throw new Exception("Imię jest puste");
//            }
//            if (name.length() == 1) {
//                throw new Exception("Imię jest zbyt krótkie");
//            }
//            System.out.println("Hello " + name);
//        }
//        catch (Exception exception){
//            System.out.println("Wyjątek");
//        }
//    }
}