package com.att.java.exercise.inheritance;

public class Shape {

    protected String color;


    //Constructors/
    //Default Constructors
    public Shape(){ }

    //Constructor 2
    public Shape(String color) {
        this.color = color;
    }

    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Methods
    public double calcArea(double r, String color) {

        throw new UnsupportedOperationException("Unknown Shape");

    }
    public double calcPerimeter(double r, String color){
        throw new UnsupportedOperationException("Unknown Shape");
    }


    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + '}';
    }
}
