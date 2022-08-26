package com.xworkz.CRUD;

public class RefDTO {

	@Override
	public String toString() {
		return "RefDTO [Company = " + company + ", Price = " + price + ", Model = " + model + ", Door = " + door + "]";
	}

	private String company;
	private double price;
	private String model;
	private String door;

	public RefDTO() {
		System.out.println("Ref DTO Created");
	}

	public String getCompany() {
		return company;
	}

	public double getPrice() {
		return price;
	}

	public String getModel() {
		return model;
	}

	public String getDoor() {
		return door;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoor(String door) {
		this.door = door;
	}

}
