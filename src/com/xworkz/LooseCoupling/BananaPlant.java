package com.xworkz.LooseCoupling;

public class BananaPlant extends Plants {
	int noOfFruits;

	public BananaPlant() {
		System.out.println("Banana Class Constructor without Parameter");
	}

	public BananaPlant(int noOfFruits) {
		super(10, 5.55, "Black");
		this.noOfFruits = noOfFruits;
		System.out.println("Banana Class Constructor with Parameter");
	}

	void givesBananaLeaves() {
		System.out.println("Gives Banana Leaves");
	}
}
