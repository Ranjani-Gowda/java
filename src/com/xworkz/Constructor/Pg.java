package com.xworkz.Constructor;

public class Pg {
	String Name;
	int Price;
	String Ratings;

	Pg(String Name, int Price, String Ratings) {
		System.out.println("PG Description : with all args constructor");
		this.Name = Name;
		this.Price = Price;
		this.Ratings = Ratings;
	}

	Pg() {
		System.out.println("PG Description : with no args constructor");
	}

	Pg(String Name, int Price) {
		System.out.println("PG Description : with 2 args constructor");
		this.Name = Name;
		this.Price = Price;
	}
}
