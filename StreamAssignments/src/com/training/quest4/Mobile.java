package com.training.quest4;

public class Mobile {

	private String model;
	private String brand;
	private double price;
	private int mobileId;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	

	public Mobile( int mobileId,String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.mobileId = mobileId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getMobileId() {
		return mobileId;
	}


	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
        return "Mobile [id=" + mobileId + 
                ", model=" + model + 
                ", brand=" + brand + 
                ", price=" + price + "]";

	}
	

}

