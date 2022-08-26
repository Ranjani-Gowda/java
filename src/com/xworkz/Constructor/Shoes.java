package com.xworkz.Constructor;

public class Shoes {
	String Brand;
	int Price;
	int Size;

	Shoes(String Brand, int Price, int Size) {
		System.out.println("Shoes Description : with all args constructor");
		this.Brand = Brand;
		this.Price = Price;
		this.Size = Size;
	}

	Shoes() {
		System.out.println("Shoes Description : With no args constructor ");
	}

	Shoes(String Brand, int Size) {
		System.out.println("Shoes Description : with 2 args constructor");
		this.Brand = Brand;
		this.Size = Size;
	}
}
