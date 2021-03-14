package com.sda.examples;

public class Greeter {

    public void greet(){
        System.out.println("Hello, World!");
    }
    public void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String greeting, String name){
        System.out.println(greeting + " , " + name + "!");
    }




    public static void main(String[] args) {
        Greeter objectGreeter = new Greeter();

        objectGreeter.greet();
        objectGreeter.greet("Kasia");
        objectGreeter.greet("Hi", "Basia");

    }
}
