package com.mthree.java_classes_and_objects.shapes_and_perimeters;

public class Circle extends Shape {
    private final double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
