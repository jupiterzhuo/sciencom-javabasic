package com.sciencom.oop;


public class AbstractTest {
	public static void main(String[] args) {
		
		Circle objCircle = new Circle("Green", 7);
		Rectangle objRectangle = new Rectangle("Red", 10, 5);
		
		System.out.println(objCircle.toString());
		System.out.println(objRectangle.toString());
	}
}

//base class 

abstract class Shape{
	String color;

	public Shape(String color) {
		this.color = color;
	}
	//abstract method
	public abstract double area();
	//abstract method
	public abstract String toString();
	
	public String getColor() {
		return this.color;
	}
}

class Circle extends Shape {

	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle Color is " + 
				super.color + " and Area is" + area();
	}
	
}

class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle Color is " + 
		super.color + " and Area is" + area();
	}
	
}

