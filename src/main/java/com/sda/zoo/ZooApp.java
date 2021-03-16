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

        Eagle eagle2 = new Eagle();
        eagle2.run(23);

        Duck duck2 = new Duck();
        duck2.run(23);

        RunBehaviour eagle3 = new Eagle();
        eagle3.run(34);

        RunBehaviour duck3 = new Duck();
        duck3.run(34);

        Ground ground = new Ground();
        ground.runOnGround(eagle2,34);
        ground.runOnGround(duck2,200);
        ground.runOnGround(duck3,300);


        Dog dog1 = new Dog();
        dog1.eat("bone");
        dog1.run(23);

        Robot robot1 = new Robot();
        robot1.run(233);


        RunBehaviour gepard = new RunBehaviour() {
            @Override
            public String run(double speed) {
                double exitSpeed = speed;
                if (speed<300){
                     exitSpeed =300;
                }
                System.out.println("Gepard biegnie z prędkością " + exitSpeed);
                return null;
            }

            @Override
            public String toString() {
                return "gepard{}";
            }
        };

        gepard.run(350);
        ground.runOnGround(gepard,200);

    }
}
