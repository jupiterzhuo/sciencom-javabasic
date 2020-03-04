package com.sciencom.interfaceimpl;

public class ShapeImpl {
	public static void main(String[] args) {
		
		Shape shape = new Circle(10);
		double areaCircle = shape.getArea();
		System.out.println("Circle Area is :" + areaCircle);
		shape.draw();
		
		shape = new Rectangle(10, 5);
		double areaRectangle = shape.getArea();
		System.out.println("Rectangle area is : " + areaRectangle);
		shape.draw();
		
		
	}
}
