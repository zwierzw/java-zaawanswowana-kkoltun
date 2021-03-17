package com.sda.OOP.figures;

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
        setLength(width);
    }

    @Override
    public void setLength(double length){
        super.setLength(length);
        setWidth(length);
    }


    @Override
    public String toString() {
        return String.format("Square with length=%f is a subclass off %s", getLength(), super.toString());
    }

    //Czemu to nie działa

}
