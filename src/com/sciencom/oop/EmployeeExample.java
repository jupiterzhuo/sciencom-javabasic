package com.sciencom.oop;

public class EmployeeExample {
	public static void main(String[] args) {
		// cara panggil class(create object) / instansiasi object
		Employee budi = new Employee();
		//Set Nilai pada property
		budi.setId(1); 
		budi.setName("budi");
		budi.setAge(20);
		budi.setSalary(10_000_000);
		//panggil method
		budi.tampilInformasi();
		double gajiBonus =budi.hitungGaji(budi.getSalary());
		System.out.println("Gaji budi : " + gajiBonus);
		System.out.println("===================================");
		// Call Student 
		
		Student objStudent = new Student();

		// Set Student
		objStudent.setId(1);
		objStudent.setName("Andi");
		objStudent.setGrade(5);
		
		//Get Student
		System.out.println("Name :" + objStudent.getName());
		System.out.println("Grade :" + objStudent.getGrade());
		System.out.println("===================================");
		
		//Call Method
		objStudent.tampilkanInformasiNama();
		
		System.out.println("===================================");
		
		Student objStudent2 = new Student();
		//Get Student
		System.out.println("Grade :" + objStudent2.getId());
		System.out.println("Name :" + objStudent2.getName());
		System.out.println("Grade :" + objStudent2.getGrade());
	
		System.out.println("===================================");
		
		Student objStudent3 = new Student(12, "Jupiter", 10);
		objStudent3.tampilkanInformasiNama();
		
		// Call Part Time Employee
		
		EmployeePartTime objEmp01 = new EmployeePartTime();
		
		objEmp01.setId(1);
		objEmp01.setName  ("Joko");
		objEmp01.setSalary(5_000_000);
		objEmp01.setMandays(100);
		objEmp01.tampilInformasi();
		//double mandays = objEmp01.hitungMandays(objEmp01.getMandays());
		System.out.println("Jumlah mandays " + 
		objEmp01.hitungMandays(objEmp01.getMandays()));
		
		
		EmployeePartTime objEmp02 = 
				new EmployeePartTime(12, "Ida", 30, 10_000_000, 12);
		
		objEmp02.tampilInformasi();
		
		
		
	}
}


