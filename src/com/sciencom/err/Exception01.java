package com.sciencom.err;

public class Exception01 {

	public static void main(String[] args) {
		// single try catch
		try {
			int a = 5/0;
			System.out.println("hasil a :" + a);

		} 
		catch (Exception e) {
			System.out.println("Error Message : " + e.getMessage());
		}
		//Multiple try catch
		try {
			int arr[] = new int[10];
			arr[8] = 100;
		} 
		catch (NumberFormatException e) {
			System.out.println("Number Format "
					+ "Error Message : " + e.getMessage());
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out of bound "
					+ "Error Message : " + e.getMessage());
		}
		finally {
			System.out.println("Tetap Diproses");
		}
		

	}
}
