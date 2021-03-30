package com.sda.OOP_home.GeometricObject;

public class ResizableCircle implements Resizable {
    private Circle circle;

    public ResizableCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public Circle resize(int percent) {
        circle.setRadius(circle.getRadius() * percent/100);
        return circle;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                ", circle=" + circle +
                ", area=" + circle.getArea() +
                ", perimeter=" + circle.getPerimeter() +
                '}';
    }
}
