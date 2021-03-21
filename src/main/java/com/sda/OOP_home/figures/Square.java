package com.sda.OOP_home.figures;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double length) {
        setColor(color);
        setIsFilled(isFilled);
        setWidth(length);
        setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }


    @Override
    public String toString() {
        return String.format("Square with width=%f and length=%f which is subclass off %s",
                getWidth(), getLength(), super.toString());
    }
    //Czemu to nie działa

}
