package com.xworkz.LooseCoupling;

public class MangoPlant extends Plants {
	int noOfFruits;

	public MangoPlant() {
		System.out.println("Mango Class Constructor without Parameter");
	}

	public MangoPlant(int noOfFruits) {
		super(15, 3.45, "Yellow");
		this.noOfFruits = noOfFruits;
		System.out.println("Mango Class Constructor with Parameter");
	}

	void givesMangoLeaves() {
		System.out.println("Gives Mango Leaves");
	}
}
