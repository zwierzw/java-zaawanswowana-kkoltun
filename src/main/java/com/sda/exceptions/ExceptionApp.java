package com.sda.exceptions;

import java.util.Locale;

public class ExceptionApp {
    public static void main(String[] args) {
        String tekst = null;
        try {
            System.out.println(tekst.toUpperCase());
        } catch (NullPointerException exception){
            System.out.println("Wystąpił wyjątek " + exception.getMessage());
        } finally {
            System.out.println("Czyszczę po sobie!");
        }

    }
}
