package com.sda.calc.triangles;

import java.util.Scanner;

public class NumberLoader {

    public static int loadFromUser() throws InvalidInputException{
        try {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            int number = Integer.parseInt(text);
            return number;
        } catch (NumberFormatException numberFormatException){
            throw new InvalidInputException();
        }

    }
}
