package com.sda.OOP.point2D_3D_and_line;

public class Line {
    private Point2D start = new Point2D();
    private Point2D end = new Point2D();

    public Line() {
        this.start = start;
        this.end = end;
    }

    public Line(float a, float b, float c, float d) {
        this.start = new Point2D(a,b);
        this.end = new Point2D(c,d);
    }

    public float getLength() {
        return (float) Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
    }

    public Point2D getMiddle() {
        Point2D middle = new Point2D();
        middle.setX((float) Math.sqrt(Math.pow(start.getX() - end.getX(), 2))/2);
        middle.setY((float) Math.sqrt(Math.pow(start.getY() - end.getY(), 2))/2);
        return middle;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                ", length"+ getLength() +
                ", middle"+ getMiddle() +
                '}' ;
    }
}
