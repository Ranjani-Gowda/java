package com.xworkz.OOPS;

public class Light {
	String color;
	int price;
	String voltage;
	String Name;

	public static void main(String[] args) {
		Light Philips = new Light();
		Philips.color = "White";
		Philips.Name = "Philips";
		Philips.price = 200;
		Philips.voltage = "20V";

		System.out.println(Philips.Name);
		System.out.println(Philips.color);
		System.out.println(Philips.price);
		System.out.println(Philips.voltage);
		System.out.println();

		Light Bajaj = new Light();
		Bajaj.Name = "Bajaj";
		Bajaj.color = "Red";
		Bajaj.price = 500;
		Bajaj.voltage = "30V";

		System.out.println(Bajaj.Name);
		System.out.println(Bajaj.color);
		System.out.println(Bajaj.price);
		System.out.println(Bajaj.voltage);
		System.out.println();

		Light HPL = new Light();
		HPL.Name = "HPL";
		HPL.color = "Green";
		HPL.price = 300;
		HPL.voltage = "35V";

		System.out.println(HPL.Name);
		System.out.println(HPL.color);
		System.out.println(HPL.voltage);
		System.out.println(HPL.price);

	}
}