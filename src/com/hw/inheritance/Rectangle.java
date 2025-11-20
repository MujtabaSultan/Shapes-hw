package com.hw.inheritance;

public class Rectangle extends Shape{

    private double side1;
    private double side2;


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public double getCircumference() {
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea() {
        return side1*side2;
    }
}
