package com.xworkz.Constructor;

public class TestPg {

	public static void main(String args[]) {
		Pg Ganga = new Pg("Ganga", 5000, "***");
		System.out.println("Name : " + Ganga.Name);
		System.out.println("Price : " + Ganga.Price);
		System.out.println("Ratings : " + Ganga.Ratings);
		System.out.println();

		Pg Krishna = new Pg();
		Krishna.Name = "Krishna";
		Krishna.Price = 5500;
		Krishna.Ratings = "****";
		System.out.println("Name : " + Krishna.Name);
		System.out.println("Price : " + Krishna.Price);
		System.out.println("Ratings : " + Krishna.Ratings);
		System.out.println();


		Pg Govinda = new Pg("Govinda", 4500);
		System.out.println("Name : " + Govinda.Name);
		System.out.println("Price : " + Govinda.Price);
		System.out.println("Ratings : " + Govinda.Ratings);

	}
}
