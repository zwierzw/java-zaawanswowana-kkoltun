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

        FlyBehavior plain = new FlyBehavior() {
            @Override
            public void fly (double height){
                if (height>=3000){
                    System.out.println("Latam na wysokości "+ height);
                } else {
                    System.out.println("Latam na wysokości 3000");
                }
            }
        };

        plain.fly(500);
        plain.fly(3500);

    }
}
