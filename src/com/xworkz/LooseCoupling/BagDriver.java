package com.xworkz.LooseCoupling;

public class BagDriver {

	public static void main(String[] args) {
		Bag b = new Bag("Black", 999, "School Bag", "Medium", "Good");
		System.out.println("Color = " + b.color);
		System.out.println("Type of Bag = " + b.typeOfBag);
		System.out.println("Price = " + b.price);
		System.out.println("Quality = " + b.quality);
		System.out.println("Size = " + b.size);
		b.noOfBooks();

		WildCraft w = new WildCraft("*****", 4);
		System.out.println("Color = " + w.color);
		System.out.println("Type og Bag = " + w.typeOfBag);
		System.out.println("Price = " + w.price);
		System.out.println("Quality = " + w.quality);
		System.out.println("Size = " + w.size);
		w.durability();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		Nike n = new Nike("Leather", 5);
		System.out.println("Color = " + n.color);
		System.out.println("Type of Bag = " + n.typeOfBag);
		System.out.println("Price = " + n.price);
		System.out.println("Quality = " + n.quality);
		System.out.println("Size = " + n.size);
		n.wash();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		// LOOSE COUPLING CONCEPT - TO CAN ACCESS BOTH PARENT AND CHILD CLASS
		Bag b1 = new WildCraft("****", 3); // HERE CAN ACCESS ONLY PARENT CLASS
		WildCraft castedwc = (WildCraft) b1; // HERE CAN ACCESS BOTH PARENT AND CHILD CLASS
		System.out.println("Color = " + castedwc.color);
		System.out.println("Type of Bag = " + castedwc.typeOfBag);
		System.out.println("Price = " + castedwc.price);
		System.out.println("Quality = " + castedwc.quality);
		System.out.println("Size = " + castedwc.size);
		System.out.println("No of Runner = " + castedwc.noOfRunner);
		System.out.println("Ratings = " + castedwc.ratings);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		Bag b2 = new Nike("Cotton", 6);
		Nike castedn = (Nike)b2;
		System.out.println("Color = " + castedn.color);
		System.out.println("Type of Bag = " + castedn.typeOfBag);
		System.out.println("Price = " + castedn.price);
		System.out.println("Quality = " + castedn.quality);
		System.out.println("Size = " + castedn.size);
		System.out.println("Made up of = " + castedn.madeUpOf);
		System.out.println("Years = " + castedn.years);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		BagOperator o = new BagOperator();
		o.operatorBag(b1);
	    o.operatorBag(b2);
	    //o.operatorBag(n);
	    //o.operatorBag(w);
	  //  o.operatorBag(castedn);
	  //  o.operatorBag(castedwc);
		





	}
}
