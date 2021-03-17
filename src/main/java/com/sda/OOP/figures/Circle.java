package com.sda.OOP.figures;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        setColor("unknown");
        setIsFilled(false);
        this.radius = 1;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius){
        return Math.PI*Math.sqrt(radius);
    }

    public double getPerimeter (double radius){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a sublass off %s", getRadius(), super.toString());
    }
}
