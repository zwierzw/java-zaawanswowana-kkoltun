package com.sda.OOP.figures;

public class FiguresApp {
    public static void main(String[] args) {
//        Shape shape = new Shape("czerwony", true);
//        System.out.println(shape.toString());

        Circle circle = new Circle("niebieski", true, 23);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(null, false, 10,5);
        System.out.println(rectangle.toString());

        Square square = new Square("czerwony", true, 23);
        System.out.println(square.toString());


    }

}
