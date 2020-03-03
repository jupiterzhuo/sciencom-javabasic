package com.sciencom.oop;

public class EmployeePartTime extends Employee {
	private int mandays;

	
	public EmployeePartTime(int id, 
			String name, 
			int age, 
			double salary, 
			int mandays) {
		super(id, name, age, salary);
		this.mandays = mandays;
	}
	
	
	public EmployeePartTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EmployeePartTime(int id, String name, int age, double salary) {
		super(id, name, age, salary);
		// TODO Auto-generated constructor stub
	}


	public int getMandays() {
		return mandays;
	}

	public void setMandays(int mandays) {
		this.mandays = mandays;
	}
	
	public double hitungMandays(int mandays) {
		return mandays * 0.1;
	}
	
	
}
