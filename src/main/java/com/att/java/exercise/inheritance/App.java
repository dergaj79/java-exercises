package com.att.java.exercise.inheritance;

import java.util.concurrent.Callable;

public class App {

	/*
	   Exercise 1:
	   1. Create Shape Class and Circle that extends it.
		  Shape should have:
		  1. A (protected) color attribute
          2. Public: 
          		calcArea(), calcPerimeter(), getColor(), setColor() methods. 
          		(area and perimiter methods can either return -1 or throw an UnsupportedMethodException).

	   2. Create Circle Class that extends Shape and implements:
 		  calcArea(), calcPerimeter()
	 */

//    public static void main(String[] args) {
//        System.out.println("DDDDDDDDDDDDDDDDDDDDDD");
//    }


	public static void main(String[] args) {
		//Test your solution:
		//Create a shape and print it

		// Does, the following statement compiles? If not, why?
		// Do u recommend it?
		//Shape circle  = new Circle();

		//Create a Blue circle with radius=5
		//...

		//Print Circle's area, perimeter and color
		//...
//
//		Shape shape1 = new Shape("Yellow");
//		System.out.println("CalcArea of Shape  is :"+ shape1.calcArea(2.2,"blue"));
//		System.out.println(shape1);
		Shape circle1 = new Circle("Blue",5.0);
		Circle circle2 = new Circle();

		System.out.println("Get Circle Color: " + circle1.getColor());
        System.out.println("Circle Area: "+ circle2.calcArea(5.0, "yellow"));
        System.out.println("Perimeter " +circle1.calcPerimeter(5.0,"blue"));
        System.out.println("ToString : "+ circle1.toString());

		}


}
