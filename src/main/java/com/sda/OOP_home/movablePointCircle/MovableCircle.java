package com.sda.OOP_home.movablePointCircle;

public class MovableCircle implements Movable {
    private double radius;
    private MovablePoint movablePoint;

    public MovableCircle(double radius, MovablePoint movablePoint) {
        this.radius = radius;
        this.movablePoint = movablePoint;
    }

    @Override
    public void moveUp() {
        movablePoint.setY(movablePoint.getY() + movablePoint.getySpeed());
    }

    @Override
    public void moveDown() {
        movablePoint.setY(movablePoint.getY() - movablePoint.getySpeed());
    }

    @Override
    public void moveLeft() {
        movablePoint.setX(movablePoint.getX() - movablePoint.getxSpeed());
    }

    @Override
    public void moveRight() {
        movablePoint.setX(movablePoint.getX() + movablePoint.getxSpeed());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public MovablePoint getMovablePoint() {
        return movablePoint;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
