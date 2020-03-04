package com.sciencom.collection;

public class GenericExample {
	
	///Generic class ditandai dengan tanda "<>"
	/* Dimana pada generic kita dapat mendefinisikan 
	 * type data apa saja(type data jangan yang primitive)
	 * 	long => diganti Long
		double => diganti Double
	*/
	public static void main(String[] args) {
		MyGen<String> obj1 = new MyGen();
		obj1.add("Test");
		System.out.println(obj1.get());
		
		MyGen<Integer> obj2 = new MyGen();
		obj2.add(1);
		System.out.println(obj2.get());
		
		MyGen<Person> obj3 = new MyGen();
		obj3.add(new Person(1, "Jupiter"));
		System.out.println("Id :" +obj3.get().getId());
		System.out.println("Name :" +obj3.get().getName());
	
		
	}
}

class Person{
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}


class MyGen<T>{
	T obj;
	
	//Add
	void add(T obj) {
		this.obj=obj;
	}
	
	//Get
	T get() {
		return obj;
	}
}