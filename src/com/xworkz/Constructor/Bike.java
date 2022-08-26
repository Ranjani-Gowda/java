package com.xworkz.Constructor;

public class Bike {
	String Company;
	int Price;
	String Color;

	Bike(String Company, int Price, String Color) {
		System.out.println("Bike Description : with all args constructor");
		this.Company = Company;
		this.Price = Price;
		this.Color = Color;
	}

	Bike() {
		System.out.println("Bike Description : With no args constructor ");
	}

	Bike(int Price, String Color) {
		System.out.println("Bike Description : with 2 args constructor");
		this.Price = Price;
		this.Color = Color;
	}
}
