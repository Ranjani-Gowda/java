package com.xworkz.LooseCoupling;

public class Bag {
	String color;
	int price;
	String typeOfBag;
	String size;
	String quality;

	public Bag() {
		System.out.println("Without Parameters");
		System.out.println();
	}

	public Bag(String color, int price, String typeOfBag, String size, String quality) {
		this.color = color;
		this.typeOfBag = typeOfBag;
		this.price = price;
		this.quality = quality;
		this.size = size;
		//System.out.println("With Parameters");
		System.out.println();
	}

	void noOfBooks() {
		System.out.println("Can keep 15 books");
		System.out.println();
	}

}
