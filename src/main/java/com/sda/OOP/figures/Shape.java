package com.sda.OOP.figures;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String result;
        if (isFilled()) {
            result = "filled";
        } else{
            result = "NotFilled";
        }
        return String.format("Shape with color of %s and %s", getColor(), result);
    }
}
