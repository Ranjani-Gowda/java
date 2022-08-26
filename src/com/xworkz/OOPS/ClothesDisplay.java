package com.xworkz.OOPS;

public class ClothesDisplay {

	public static void main(String[] args) {
		Clothes Levis = new Clothes();
		Clothes CK = new Clothes();
		Clothes AllenSolly = new Clothes();

		Levis.Brand = "Levis";
		Levis.Color = "Black";
		Levis.Price = 1500;
		Levis.Size = 'M';

		System.out.println("Description");
		System.out.println(Levis.Brand);
		System.out.println(Levis.Color);
		System.out.println(Levis.Price);
		System.out.println(Levis.Size);
		System.out.println();

		CK.Brand = "CK";
		CK.Color = "White";
		CK.Price = 2000;
		CK.Size = 'S';

		System.out.println("Description");
		System.out.println(CK.Brand);
		System.out.println(CK.Color);
		System.out.println(CK.Price);
		System.out.println(CK.Size);
		System.out.println();

		AllenSolly.Brand = "AllenSolly";
		AllenSolly.Color = "Grey";
		AllenSolly.Price = 3000;
		AllenSolly.Size = 'L';

		System.out.println("Description");
		System.out.println(AllenSolly.Brand);
		System.out.println(AllenSolly.Color);
		System.out.println(AllenSolly.Price);
		System.out.println(AllenSolly.Size);
		System.out.println();

	}

}
