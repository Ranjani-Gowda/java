package com.xworkz.LooseCoupling;

public class PlantOperator {

	void operatorPlant(Plants plant) {

		if (plant instanceof MangoPlant) {

			MangoPlant castedMango = (MangoPlant) plant;
			System.out.println("Inside 1st block");
			System.out.println(castedMango.age);
			System.out.println(castedMango.noOfFruits);
			System.out.println(castedMango.color);
			System.out.println(castedMango.height);
			System.out.println();
		}
		
		if (plant instanceof BananaPlant) {
			BananaPlant castedBanana =(BananaPlant) plant;

			System.out.println("Insinde 2nd block");
			System.out.println(castedBanana.age);
			System.out.println(castedBanana.noOfFruits);
			System.out.println(castedBanana.color);
			System.out.println(castedBanana.height);
			System.out.println();
		} 
		else {
			System.out.println("No instance present");
		}
	}

}
