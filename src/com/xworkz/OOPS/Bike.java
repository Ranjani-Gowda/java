package com.xworkz.OOPS;

public class Bike {
	String Company;
	String Name;
	int price;
	String cc;

	public static void main(String[] args) {
		Bike R15 = new Bike();
		R15.Company = "Yamaha";
		R15.Name = "R15";
		R15.cc = "150CC";
		R15.price = 200000;

		System.out.println("Bike Details");
		System.out.println(R15.Company);
		System.out.println(R15.Name);
		System.out.println(R15.price);
		System.out.println(R15.cc);
		System.out.println();

		Bike Pulsar = new Bike();
		Pulsar.Company = "Bajaj";
		Pulsar.Name = "Pulsar";
		Pulsar.price = 150000;
		Pulsar.cc = "220CC";

		System.out.println("Bike Details");
		System.out.println(Pulsar.Company);
		System.out.println(Pulsar.Name);
		System.out.println(Pulsar.price);
		System.out.println(Pulsar.cc);
		System.out.println();

		Bike RE = new Bike();
		RE.Company = "Royal Enfield";
		RE.Name = "Himalayan";
		RE.cc = "100CC";
		RE.price = 250000;

		System.out.println("Bike Details");
		System.out.println(RE.Company);
		System.out.println(RE.Name);
		System.out.println(RE.cc);
		System.out.println(RE.price);

	}
}
