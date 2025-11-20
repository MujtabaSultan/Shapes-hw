package com.hw.inheritance;

public class Main {
    private static String getCircumferenceAndArea(Shape shape){

        double area =shape.getArea();
        double circum = shape.getCircumference();
        return  shape.getClass().getSimpleName() + " area is " + area + " circum is " + circum;


    }
    public static void main(String[] args) {

        Triangle triangle  = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle    = new Circle( 4);
        Square square    = new Square(4);
        System.out.println(getCircumferenceAndArea(triangle));
        System.out.println(getCircumferenceAndArea(rectangle));
        System.out.println(getCircumferenceAndArea(square));
        System.out.println(getCircumferenceAndArea(circle));
    }
}
