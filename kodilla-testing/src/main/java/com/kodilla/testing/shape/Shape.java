package com.kodilla.testing.shape;

public interface Shape {

    String getShapeName();
    double getField();
}

class Circle implements Shape {
    String name;
    double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public double getField() {
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    public String getShapeName() {
        return this.name;
    }
}

class Square implements Shape {
    String name;
    double a;

    public Square (String name, double a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }

    @Override
    public String getShapeName() {
        return this.name;
    }
}

class Triangle implements Shape {
    String name;
    double a;
    double b;
    double c;

    public Triangle (String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getField() {
        double p =(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String getShapeName() {
        return this.name;
    }
}