package com.mthree.java_classes_and_objects.shapes_and_perimeters;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(String colour, double length, double width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
