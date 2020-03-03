package com.sciencom;

public class JavaLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. inisilisasi nilai awal(counter)
		//2. Batasan(counter)
		//3. Penmabahan dari nilai counter
		
		for (int i = 0; i < 11; i++) {
			System.out.println("Saya Belajar Java");
			
		}
		
		//int[] myArray= {1,2,3,4,5};
		int myArray []= {1,2,3,4,5};
		System.out.println("Nilai Array 1 :" + myArray[0]);
		
		// for 
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Nlai array ke " + i + " :"+ myArray[i]);
		}
		//
		for (int arrayKu : myArray) {
			System.out.println("Nlai array ke :" + arrayKu);
		}
		
		//While 
		int count=0;
		while (count <10) {
			System.out.println("Hello ini dari while");
			count = count+2;
		}
	}

}
