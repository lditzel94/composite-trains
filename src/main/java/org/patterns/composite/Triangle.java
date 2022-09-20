package org.patterns.composite;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle( double height, double base ) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calcArea() {
        return height * base / 2;
    }
}
