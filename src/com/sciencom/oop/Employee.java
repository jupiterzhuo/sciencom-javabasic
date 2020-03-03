package com.sciencom.oop;

public class Employee {
	//1. Property
	//2. Method
	
	//Property
	private int id;
	private String name;
	private int age;
	private double salary;
	
	
	
	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public Employee() {
	
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	//Method
	double hitungGaji(double salary) {
		return salary + 10_000;
	}
	

	
	void tampilInformasi() {
		System.out.println("Tampilkan Informasi");
		System.out.println("Nama " + name);
		System.out.println("Umur " + age);
		System.out.println("Gaji Pokok " + salary);
	}
}


