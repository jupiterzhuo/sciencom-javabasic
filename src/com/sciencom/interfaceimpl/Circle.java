package com.sciencom.interfaceimpl;

public class Circle implements Shape  {
	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}
}
