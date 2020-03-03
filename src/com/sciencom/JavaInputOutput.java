package com.sciencom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class JavaInputOutput {
	
	public static void main(String[] args) throws IOException  {
		//input scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nama anda : ");
		String nama = sc.next();
		
		System.out.println("Masukan umur anda : ");
		int umur = sc.nextInt();
		
		System.out.println("======Summary===========");
		System.out.println("Nama : " + nama);
		System.out.println("Umur : " + umur);
		
		//bufferd reader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//Format Decimal
		String pattern = "###,###.###";
		DecimalFormat format = new DecimalFormat(pattern);
		
		System.out.println("Masukan nama anda : ");
		String nameBuffer = br.readLine();
		
		System.out.println("Masukan umur anda : ");
		int ageBuffer = Integer.parseInt(br.readLine());
		
		System.out.println("Masukan Gaji anda : ");
		double salaryBuffer = Double.parseDouble(br.readLine());
		String salaryFormat = format.format(salaryBuffer);
		
		System.out.println("======Summary===========");
		System.out.println("Nama : " + nameBuffer);
		System.out.println("Umur : " + ageBuffer);
		System.out.println("Salary : " + salaryFormat);
	}
}
