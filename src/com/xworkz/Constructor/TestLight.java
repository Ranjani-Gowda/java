package com.xworkz.Constructor;

public class TestLight {

	public static void main(String[] args) {
		Light Wipro = new Light("Wipro", 200, "White");
		System.out.println("Company : " + Wipro.Company);
		System.out.println("Price : " + Wipro.Price);
		System.out.println("Color : " + Wipro.Color);
		System.out.println();

		Light Bajaj = new Light();
		Bajaj.Company = "Bajaj";
		Bajaj.Price = 150;
		Bajaj.Color = "Red";
		System.out.println("Company : " + Bajaj.Company);
		System.out.println("Price : " + Bajaj.Price);
		System.out.println("Color : " + Bajaj.Color);
		System.out.println();

		Light Surya = new Light("Surya", "Green");
		System.out.println("Company : " + Surya.Company);
		System.out.println("Price : " + Surya.Price);
		System.out.println("Color : " + Surya.Color);

	}

}
