package com.sciencom.interfaceimpl;

public interface Shape {
	//Property harus di inisialisasi
	public String label="shape";
	//ini adalah abstract method tanpa keyword abstract
	
	// access modifier : default / public 
	public void draw();
	public double getArea();
}

