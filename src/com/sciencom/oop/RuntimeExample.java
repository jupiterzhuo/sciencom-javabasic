package com.sciencom.oop;

public class RuntimeExample {
	//override
	public static void main(String[] args) {
		Multiplication obj = new Multiplication();
		System.out.println("a * b ="+ obj.calculate(10, 2));
		
		Multiplication obj2 = new Division();
		System.out.println("a * b ="+ obj2.calculate(10, 2));
	}
}


class Multiplication{
	double calculate(double a,double b) {
		return a * b;
	}
}

class Division extends Multiplication{

	@Override
	double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}