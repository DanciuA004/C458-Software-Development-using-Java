package com.mthree.java_classes_and_objects.shapes_and_perimeters;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(String colour, double side1, double side2, double side3) {
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - getSide1()) + getPerimeter() * (getPerimeter() - getSide2()) + getPerimeter() * (getPerimeter() - getSide3()));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
