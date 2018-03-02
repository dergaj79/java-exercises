package com.att.java.exercise.inheritance;

/**
 * Concrete Shape that represents a Circle
 */
public class Circle extends Shape {

    protected double radius;

    //default Constructor
    public Circle(){
        super();
    }
    //Constructor 2
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    //Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = radius;
    }

    @Override
    public double calcArea(double r, String color) {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcPerimeter(double r, String color) {
        return Math.PI * radius * radius;
    }


    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "} " + super.toString();
    }
}
