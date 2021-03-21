package com.sda.Exceptions_home.divide;

public class DivisionApp {

    public static void main(String[] args) {
        try{
            Division division = new Division();
            division.divide();
        } catch (CannotDivideBy0Exception e) {
            System.out.println("Hey, you've got a mistake: " + e.getMessage());
        } finally {
            System.out.println("I'm cleaning!");
        }


        try{
            Division division2 = new Division();
            division2.divide();
        } catch(CannotDivideBy0Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
