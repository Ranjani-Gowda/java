package com.xworkz.LooseCoupling;

public class BagOperator {

	void operatorBag(Bag AS) {
		if (AS instanceof WildCraft) {
			WildCraft castedw = (WildCraft) AS;
			System.out.println("Inside WildCraft");
			System.out.println(castedw.color);
			System.out.println(castedw.noOfRunner);
			System.out.println(castedw.price);
			System.out.println(castedw.quality);
			System.out.println(castedw.ratings);
			System.out.println(castedw.size);
			System.out.println(castedw.typeOfBag);
			castedw.durability();
			System.out.println();
			System.out.println(".........................................");
		}
		if (AS instanceof Nike) {
			Nike castedn = (Nike) AS;
			System.out.println("Inside Nike");
			System.out.println(castedn.color);
			System.out.println(castedn.madeUpOf);
			System.out.println(castedn.price);
			System.out.println(castedn.quality);
			System.out.println(castedn.size);
			System.out.println(castedn.typeOfBag);
			System.out.println(castedn.years);
			castedn.wash();
			System.out.println();
			System.out.println(".........................................");

		} else {
			System.out.println("No parametrs");
		}

	}

}
