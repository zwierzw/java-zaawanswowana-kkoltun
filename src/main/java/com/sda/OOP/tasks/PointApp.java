package com.sda.OOP.tasks;

public class PointApp {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(123.234f);
        point2D.setY(234.0978f);
        point2D.getX();
        point2D.toString();
        point2D.setXY(123,123.234f);
        point2D.getXY();



        Point3D point3D = new Point3D(12.323f,4234.23f,234.12f);
        point3D.setX(123.234f);
        point3D.setY(234.0978f);
        point3D.getX();
        point3D.toString();
        point3D.setXY(123,123.234f);
        point3D.getXY();
        System.out.println(point3D);






    }
}
