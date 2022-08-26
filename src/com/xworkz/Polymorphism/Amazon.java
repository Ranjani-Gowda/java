package com.xworkz.Polymorphism;

public class Amazon {
	public void filter(String Section, int price) {
		System.out.println("Filter applied for Womens Clothing");
	}

	public void filter(String section, String discount) {
		System.out.println("Discount applied for Kitchen appliances");
	}

	public void filter(String Section, int price,int userID) {
		System.out.println("Filter applied for Prime Membership Holders");
	}
}