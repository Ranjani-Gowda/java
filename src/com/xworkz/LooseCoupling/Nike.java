package com.xworkz.LooseCoupling;

public class Nike extends Bag {
	String madeUpOf;
	int years;
	
	public Nike() {
		System.out.println("Nike - no Parameters");
	}
	
	public Nike(String madeUpOf, int years) {
		super("White", 499, "Sling Bag", "Small", "Good");
		this.madeUpOf = madeUpOf;
		this.years = years;
		System.out.println("Nike - with Parameters");
	}
	
	void wash() {
		System.out.println("No rough washes");
	}
}
