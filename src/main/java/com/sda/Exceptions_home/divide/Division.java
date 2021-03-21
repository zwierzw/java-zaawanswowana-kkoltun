package com.sda.Exceptions_home.divide;

public class Division {
    private double a;
    private double b;


    public double divide() throws CannotDivideBy0Exception {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return (double) a / b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Division() {
        this.a = 0;
        this.b = 0;
    }

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

}
