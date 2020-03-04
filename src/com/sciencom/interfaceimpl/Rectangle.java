package com.sciencom.interfaceimpl;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

}
