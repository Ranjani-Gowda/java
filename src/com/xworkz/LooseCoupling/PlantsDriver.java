package com.xworkz.LooseCoupling;

public class PlantsDriver {

	public static void main(String[] args) {

		Plants p = new Plants(5, 5.55, "Green");
		System.out.println("Age = "+p.age);
		System.out.println("Color = "+p.color);
		System.out.println("Height = "+p.height);
		p.givesFruit();
		System.out.println();
		
		BananaPlant b = new BananaPlant(12);
		System.out.println("Age = "+b.age);
		System.out.println("Color = "+b.color);
		System.out.println("Height = "+b.height);
		System.out.println("No of Fruits = "+b.noOfFruits);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		
		MangoPlant m = new MangoPlant(50);
		System.out.println("Age = "+m.age);
		System.out.println("Color = "+m.color);
		System.out.println("Height = "+m.height);
		System.out.println("No of Fruits = "+m.noOfFruits);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		//LOOSE COUPLING CONCEPT - TO CAN ACCESS BOTH PARENT AND CHILD CLASS
		Plants p1 = new BananaPlant(60); //HERE  CAN ACCESS ONLY PARENT CLASS
		BananaPlant castedBanana = (BananaPlant)p1; // HERE CAN ACCESS BOTH PARENT AND CHILD CLASS
		System.out.println();
		System.out.println("LOOSE COUPLING CONCEPT");
		System.out.println();
		System.out.println("Age = "+castedBanana.age);
		System.out.println("Color = "+castedBanana.color);
		System.out.println("Height = "+castedBanana.height);
		System.out.println("No of Fruits = "+castedBanana.noOfFruits);
		System.out.println();
		System.out.println("************************************");
		System.out.println();
		
		Plants p2 = new MangoPlant(100);
		MangoPlant castedMango = (MangoPlant)p2;
		System.out.println("Age = "+castedMango.age);
		System.out.println("Color = "+castedMango.color);
		System.out.println("Height = "+castedMango.height);
		System.out.println("No of Fruits = "+castedMango.noOfFruits);
		System.out.println();
		System.out.println();
		System.out.println("************************************");
		System.out.println();
		

		System.out.println("instanceof CONCEPT - GIVES TRUE /FALSE VALUE AS O/P");
		//GIVES TRUE /FALSE VALUE AS O/P
		System.out.println();
		System.out.println(p instanceof MangoPlant);
		System.out.println(p2 instanceof MangoPlant);
		System.out.println("=================================================");
		System.out.println();
		
		System.out.println(p instanceof BananaPlant);
		System.out.println(p1 instanceof BananaPlant);
		System.out.println("=================================================");
		System.out.println();
		System.out.println();
		
		PlantOperator o = new PlantOperator();
	    o.operatorPlant(p);
	    o.operatorPlant(p2);
	    o.operatorPlant(p1);
	   // o.operatorPlant(castedMango);		

	}
}
