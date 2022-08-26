package com.xworkz.OOPS;

public class Pg {
	String Name;
	int Price;
	String Place;
	String Rating;

	public static void main(String[] args) {
		Pg Krishna = new Pg();
		Krishna.Name = "Krishna";
		Krishna.Place = "BTM";
		Krishna.Price = 6000;
		Krishna.Rating = "****";

		System.out.println("PG Details");
		System.out.println(Krishna.Name);
		System.out.println(Krishna.Place);
		System.out.println(Krishna.Price);
		System.out.println(Krishna.Rating);
		System.out.println();

		Pg Ganga = new Pg();
		Ganga.Name = "Ganga";
		Ganga.Place = "RR Nagar";
		Ganga.Price = 8000;
		Ganga.Rating = "***";

		System.out.println("PG Details");
		System.out.println(Ganga.Name);
		System.out.println(Ganga.Place);
		System.out.println(Ganga.Price);
		System.out.println(Ganga.Rating);
		System.out.println();

		Pg Gokul = new Pg();
		Gokul.Name = "Gokul";
		Gokul.Place = "Jaynagar";
		Gokul.Price = 10000;
		Gokul.Rating = "*****";

		System.out.println("PG Details");
		System.out.println(Gokul.Name);
		System.out.println(Gokul.Place);
		System.out.println(Gokul.Price);
		System.out.println(Gokul.Rating);

	}
}