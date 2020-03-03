package com.sciencom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Commerce {
	public static void main(String[] args) throws IOException {
		double diskon = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukkan nama Anda : ");
		String nama = sc.next();
		
		System.out.println("Apakah Anda Member : ");
		String isMember = sc.next();
		
		System.out.println("Masukkan Belanjaan Anda : ");
		double totalbelanja = sc.nextDouble();
		
	
		if (isMember.equalsIgnoreCase("y")) {

			if (totalbelanja > 500000) {
				diskon = 50000;
			}
			else if(totalbelanja >=100000 && totalbelanja <=500000) {
				diskon = 15000;
			}
			else {
				diskon =0;
			}
			
		}
		else {
			if (totalbelanja > 100000) {
				diskon = 10000;
			}
			else {
				diskon =0;
			}
		}
		String pattern = "###,###.##";
		DecimalFormat format = new DecimalFormat(pattern);

		
		System.out.println("======Summary=======");
		System.out.println("Nama   :" + nama);
		System.out.println("member   :" + isMember);
		System.out.println("Total Belanja :" + format.format(totalbelanja));
		System.out.println("Diskon Belanja :" + format.format(diskon));
	}
}
