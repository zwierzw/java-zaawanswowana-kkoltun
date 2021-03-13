package com.sda.zoo;

public class ZooApp {
    public static void main(String[] args) {
        FlyBehavior eagle = new Eagle();
        eagle.fly(120);

        FlyBehavior duck = new Duck();
        duck.fly(200);

        Air air = new Air();
        air.flyInAir(eagle);
        air.flyInAir(duck);


        Animal anotherDuck = new Duck();
        anotherDuck.eat("vegetables");

        Animal anotherEagle = new Eagle();
        anotherEagle.eat("mouse");
    }
}
