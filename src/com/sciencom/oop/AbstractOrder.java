package com.sciencom.oop;

import java.time.LocalDate;
import java.util.List;


public class AbstractOrder {

}

class Product{
	private long id;
	private String productName;
}

abstract class Order{
	private long id;
	private LocalDate createDate;
	private double amount;
	private List<Product> products;
	
	public abstract void validate();
	public abstract void process();
	
	public final void cancel() {
		// isi dengan logika bisnis
	}
}

class StoreOrder extends Order {
	private long storeId;
	private Employee storePic;
	
	@Override
	public void validate() {
		// isi dengan logika bisnis
		
	}
	@Override
	public void process() {
		// isi dengan logika bisnis	
	}
	
}

class WarehouseOrder extends Order {
	private long warehouseId;

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}
}

class OnlineOrder extends Order {
	private long couponCode;

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}
}

