package com.sciencom.oop;

public class CompileTimeExample {
	// overloading
	public static void main(String[] args) {
		Calculator  objCalculator = new Calculator();
		System.out.println("a + b =" + objCalculator.add(10.2, 29.5));
		System.out.println("a + b =" + objCalculator.add(1,2));
		System.out.println("a + b + c=" + objCalculator.add(1,2,3));
	}
}

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a,double b) {
		return a+b;
	}
}	
