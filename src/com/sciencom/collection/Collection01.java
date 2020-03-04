package com.sciencom.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection01 {

	public static void main(String[] args) {
		Double arr[][];
		List<Integer> myList = new ArrayList<>();
		List<Integer> myList1 = new ArrayList<>();
		List<Integer> myList4 = new ArrayList<>();
		ArrayList<String> myList2 = new ArrayList<>();
		
		
		myList.add(1);
		myList.add(2);
		System.out.println(myList);
		
		myList1.add(3);
		myList1.add(4);
		System.out.println(myList1);
		
		myList4.add(5);
		myList4.add(6);
		//Join
		List<Integer> newList = Stream.of(myList,myList1,myList4)
										.flatMap(Collection::stream)
										.collect(Collectors.toList());
		
		
		
		System.out.println("List Baru Join : " + newList);
		
		Set<String> newSet = new HashSet();
		
		newSet.add("Test");
		newSet.add("Test");
		newSet.add("Test1");
		newSet.add("Test2");
		
		System.out.println("Set : " + newSet);
		
		List myList3 = new ArrayList<>();
		myList3.add("Budi");
		myList3.add("Andi");
		myList3.add("Joko");
		myList3.add("Joko");
		
		//Cara-1
		System.out.println("Nilai :" + myList3);
		//Cara-2
		for (Object object : myList3) {
			System.out.println(" Nilai Value :" +  object);
		}
		//Cara-3
		Iterator itr = myList3.iterator();
		while (itr.hasNext()) {
			System.out.println(" Nilai Value :" +  itr.next());
		}
		
		//tampilkan berdasrakan index
		System.out.println("Tampilkam berdasrkan index :"
		+ myList3.get(0));
		
	}
}
