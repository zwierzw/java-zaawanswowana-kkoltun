package com.sda.OOP.figures;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        setColor("unknown");
        setIsFilled(false);
        this.width = 1;
        this.length = 1;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    public double getArea(double width, double length){
//        return width*length;
//    }
//
//    public double getPerimeter(double width, double length){
//        return 2*(width+length);
//    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f is a subclass off %s", width, length, super.toString());
    }
}
