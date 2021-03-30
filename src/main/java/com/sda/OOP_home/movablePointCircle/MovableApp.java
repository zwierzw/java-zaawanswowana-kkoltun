package com.sda.OOP_home.movablePointCircle;

public class MovableApp {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 3, 3);
        System.out.println(movablePoint);

        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);


        MovableCircle movableCircle = new MovableCircle(3, new MovablePoint(0, 0, 2, 2));
        System.out.println(movableCircle);

        movableCircle.moveUp();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);


    }

}
