package com.sciencom.interfaceimpl;

public class FlightOperation {
	public static void main(String[] args) {
		IFlightOperation garudaObj =  new GI();
		
		garudaObj.getAllSchedule();
		Booking obj = new Booking(1, "Jupiter");
		garudaObj.booking(obj);
		
		System.out.println("===========================");
		
		IFlightOperation citiObj = new CL();
		citiObj.getAllSchedule();
		citiObj.booking(new Booking(2, "Siri"));
		
	}
}

interface IFlightOperation {
	void getAllSchedule();
	void booking(Booking bookingObj);
}

class Booking {
	private long id;
	private String name;
	
	public Booking(long id, String name) {
		this.id = id;
		this.name = name;
	}
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
}

class GI implements IFlightOperation {

	@Override
	public void getAllSchedule() {
		// TODO Auto-generated method stub
		System.out.println("Get All Garuda Indonesia Schedule");
	}
	@Override
	public void booking(Booking bookingObj) {
		// TODO Auto-generated method stub
		System.out.println("Garuda Indonesia Booking Detail");
		System.out.println("Id :" + bookingObj.getId());
		System.out.println("Name :" + bookingObj.getName());
		
		
	}
	
}
//Citilimnk
class CL implements IFlightOperation{

	@Override
	public void getAllSchedule() {
		// TODO Auto-generated method stub
		System.out.println("Get All Citilink Schedule");
	}
	@Override
	public void booking(Booking bookingObj) {
		// TODO Auto-generated method stub
		System.out.println("Citilink Booking Detail");
		System.out.println("Id :" + bookingObj.getId());
		System.out.println("Name :" + bookingObj.getName());

	}
	
}

