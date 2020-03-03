package com.sciencom;

import java.util.ArrayList;

public class JavaArray {
 public static void main(String[] args) {
	 //
	 String arr [];
	 ArrayList myArrList = new ArrayList();
	 
	 myArrList.add("Halo");
	 myArrList.add("Saya");
	 myArrList.add(3);
	 myArrList.add(3.14);
	 
	 for (Object object : myArrList) {
		System.out.println("Result :" + object);
		
	 }
	 System.out.println("=====================");
	 myArrList.remove("Halo");
	 myArrList.remove(Integer.valueOf(3));
	 for (Object object : myArrList) {
			System.out.println("Result :" + object);
	 }
 }
}
