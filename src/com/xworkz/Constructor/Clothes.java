package com.xworkz.Constructor;

public class Clothes {
	String Brand;
	int Price;
	String Color;
	char Size;

	Clothes(String Brand, int Price, String Color, char Size) {
		System.out.println("Cloth Description : with all args constructor");
		this.Brand = Brand;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;

	}

	Clothes() {
		System.out.println("Cloth Description : With no args constructor ");
	}

	Clothes(String Brand, int Price) {
		System.out.println("Cloth Description : with 2 args constructor");
		this.Brand = Brand;
		this.Price = Price;
	}
}
