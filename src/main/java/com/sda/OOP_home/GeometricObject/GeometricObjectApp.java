package com.sda.OOP_home.GeometricObject;

public class GeometricObjectApp {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);


        ResizableCircle resizableCircle = new ResizableCircle(circle);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);

    }
}
