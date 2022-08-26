package com.xworkz.Constructor;

public class Light {
	String Company;
	int Price;
	String Color;

	Light(String Company, int Price, String Color) {
		System.out.println("Light Description : with all args constructor");
		this.Company = Company;
		this.Color = Color;
		this.Price = Price;
	}

	Light() {
		System.out.println("Light Description : with no args constructor");
	}

	Light(String Company, String Color) {
		System.out.println("Light Description : with 2 args constructor");
		this.Company = Company;
		this.Color = Color;

	}

}
