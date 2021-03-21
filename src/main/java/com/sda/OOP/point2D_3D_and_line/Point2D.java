package com.sda.OOP.point2D_3D_and_line;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] XY = {x, y};
        return XY;
    }

    public void setXY(float x, float y) {
        float[] XY = {x, y};
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
