package com.sciencom;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList siswa = new ArrayList();
		int input, inp;
		int dataSiswa = 0;
		String inputSiswa;
		ArrayListExample jav = new ArrayListExample();
 
		do {
			System.out.println("========= MENU =========");
			System.out.println("[1] Show All Siswa");
			System.out.println("[2] Tambah Siswa");
			System.out.println("[3] Ubah Siswa");
			System.out.println("[4] Hapus Siswa");
			System.out.println("[5] Exit");
			System.out.println("");
			System.out.println("Pilih menu :");
 
			input = Integer.parseInt(scan.nextLine());
 
			switch(input) {
				case 1:
					jav.printSiswa(siswa);
					break;
				case 2:
					System.out.println("Masukkan nama siswa baru: ");
					inputSiswa = scan.nextLine();
					siswa.add(inputSiswa);
 
					if(siswa.size()>dataSiswa) {
						dataSiswa++;
						System.out.println(inputSiswa+" telah didaftarkan");
					} else {
						System.out.println(inputSiswa+" gagal didaftarkan");
					}
					break;
				case 3:
					jav.printSiswa(siswa);
					System.out.println("Masukkan nomor siswa yang akan diubah: ");
					inp = Integer.parseInt(scan.nextLine());
					String oldSiswa = (String) siswa.get(inp-1);
					System.out.println("Masukkan nama baru siswa: ");
					siswa.remove(inp-1);
					siswa.add(inp-1, scan.nextLine());
					break;
				case 4:
					jav.printSiswa(siswa);
					System.out.println("Masukkan nomor siswa yang akan dihapus: ");
					inp = Integer.parseInt(scan.nextLine());
					inputSiswa = (String) siswa.get(inp-1);
					siswa.remove(inp-1);
 
					if(siswa.size()<dataSiswa) {
						dataSiswa--;
						System.out.println(inputSiswa+" telah dihapus");
					} else {
						System.out.println(inputSiswa+" gagal dihapus");
					}
					break;
				case 5:
					break;
				default:
					System.out.println("Masukkan pilihan menu yang sesuai");
					break;
 
			}
		} while (input!=5);
 
		System.out.println("========= SHUTTING DOWN =========");
	}
 
	private void printSiswa(ArrayList siswa)
	{
		if(!siswa.isEmpty()) {
			for (int i=1; i<=siswa.size(); i++) {
				System.out.println(i+" "+siswa.get(i-1));
			}
		} else {
			System.out.println("Belum ada data siswa");
		}
		System.out.println();
		System.out.println();
	}
}

