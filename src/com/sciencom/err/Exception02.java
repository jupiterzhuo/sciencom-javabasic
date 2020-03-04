package com.sciencom.err;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	
	public static void findFile() throws IOException,FileNotFoundException {
		File newFile = new File("Test.txt");
		FileInputStream stream =new FileInputStream(newFile);
	}
	
	public static void checkDivideByZero() {
		throw new ArithmeticException(" Tidak boleh dibagi 0");
	}
	
	public static void checkValidate(int number) throws ExceptionMadeInDewe {
		if (number==0) {
			throw new ExceptionMadeInDewe("Nilai Tidak boleh sama dengan 0");
		}
	}
	

	
	public static void main(String[] args) {
		try {
			findFile();		
		} 
		catch (Exception e) {
			System.out.println("Message : " +  e.getMessage());
		} 
		
		try {
			checkDivideByZero();
		} 
		catch (Exception e) {
			System.out.println("Message : " +  e.getMessage());
		}
	
		try {
			checkValidate(0);
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Message : " +  e.getMessage());
		}	
	}
}

class ExceptionMadeInDewe extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionMadeInDewe(String message) {
		super(message);
	}
	
}
