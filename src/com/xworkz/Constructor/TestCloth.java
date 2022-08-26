package com.xworkz.Constructor;

public class TestCloth {

	public static void main(String[] args) {
		Clothes Puma = new Clothes("Puma", 2000, "Black", 'M');
		System.out.println("Brand : " + Puma.Brand);
		System.out.println("Price : " + Puma.Price);
		System.out.println("Color : " + Puma.Color);
		System.out.println("Size : " + Puma.Size);
		System.out.println();

		Clothes AllenSolly = new Clothes();
		AllenSolly.Brand = "AllenSolly";
		AllenSolly.Price = 3000;
		AllenSolly.Color = "White";
		AllenSolly.Size = 'L';
		System.out.println("Brand : " + AllenSolly.Brand);
		System.out.println("Price : " + AllenSolly.Price);
		System.out.println("Color : " + AllenSolly.Color);
		System.out.println("Size : " + AllenSolly.Size);
		System.out.println();

		Clothes Netplay = new Clothes("Netplay", 1500);
		System.out.println("Brand : " + Netplay.Brand);
		System.out.println("Price : " + Netplay.Price);
		System.out.println("Color : " + Netplay.Color);
		System.out.println("Size : " + Netplay.Size);

	}

}
