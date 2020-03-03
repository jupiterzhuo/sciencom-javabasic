package com.sciencom;

public class Variable {
	/*
	 * Variable
	 * 1. Local Variable
	 * 2. Instance Variable
	 * 3. Static Variable
	 * 
	 * */
	//Instance Variable
	String myString = "Halo ini adalah instance variable";
	//static variable
	static Long myLong = 10L;
	
	public static void main(String[] args) {
		//local variable
		int myVariable;
		myVariable=10;

		//instansiasi
		//create object
		
		AnotherVariable obj1 =new AnotherVariable();
		Variable myObj =new Variable();
		//local variable 
		System.out.println("Nilai Variable :" + myVariable);
		//instance variable
		System.out.println("Nilai Variable :" + myObj.myString);
		System.out.println("Nilai Variable lain :" + obj1.variableLain);
		
		System.out.println("Nilai Static :" + Variable.myLong);
		System.out.println("Nilai Static vaiable lain :" + AnotherVariable.varibleStaticLain);
		
		
		
		// Casting
		int a = 100;
		float b;
		
		b=a;
		System.out.println("Widening Cast :" + b);
		
		double c =10.00;
		int d;
		d=(int) c;
		System.out.println("Narrow Cast :" + d);
		
		
		String name="Jupiter";
		int umur=23;
		System.out.println(String.format("Hello  %1$s, "
				+ "nama anda  %1$s dan umur anda %2$d ",name, umur));
		
	}

}



/*
 * 
 * class x{
 * 
 * 		int a;  // property / variable
 * 
 *  	void print(){  //Method // function
 *  
 *  		//isi method
 *  
 *  	}
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * */
