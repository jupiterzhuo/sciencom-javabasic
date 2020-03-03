package com.sciencom;

import java.util.Scanner;

public class JavaCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If
		boolean isValid =true;
		if (!isValid) { 
			System.out.println("Valid");
		}
		else {
			System.out.println("Tidak Valid");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan salah satu nilai : ");
		int num = sc.nextInt();
		
		if(num<10) {
			System.out.println(num + " Lebih Kecil dari 10");
		}
		else if (num>10) {
			System.out.println(num + " Lebih besar dari 10");
		}
		else {
			System.out.println(num + " Sama dengan 10");
		}
		
		//Ternary Operator
		String hasil = (num==10)?"Sama dengan 10 Euyyyy":"Tidak Sama dengan 10 Euyyy";
		System.out.println("Hasil :" + hasil);
		
		//Switch Case
		
		int answer;
		System.out.println("Silahkan Isi Pilihan anda");
		System.out.println("1. Naik Mobil");
		System.out.println("2. Naik Motor");
		System.out.println("3. Naik Sepeda");
		answer =sc.nextInt();
		
		switch (answer) {
		case (1):
			System.out.println("Anda pilih naik mobil ");
			break;
		case (2):
			System.out.println("Anda pilih naik motor ");
			break;
		case (3):
			System.out.println("Anda pilih naik sepeda ");
			break;
		default:
			System.out.println("Anda belum menentukan pilihan");
			break;
		}
		
		
		
		// == vs equal
		
		String kata01 = new String("Hello");
		String kata02 = "Hello";
		
		int angka01=2;
		int angka02=2;
		
		System.out.println(kata01==kata02);
		System.out.println(kata01.equals(kata02));
		
		
		System.out.println(angka01==angka02);
		
	}

}
