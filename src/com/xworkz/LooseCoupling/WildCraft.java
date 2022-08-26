package com.xworkz.LooseCoupling;

public class WildCraft extends Bag {
	String ratings;
	int noOfRunner;

	public WildCraft() {
		System.out.println("Wild Craft - no parameter");
	}

	public WildCraft(String ratings, int noOfRunner) {
		super("Red", 1999, "College Bag", "Medium", "Good");
		this.ratings = ratings;
		this.noOfRunner = noOfRunner;
		System.out.println("Wild Craft Bag - With Parameters");
	}

	void durability() {
		System.out.println("More Durable");
	}
}
