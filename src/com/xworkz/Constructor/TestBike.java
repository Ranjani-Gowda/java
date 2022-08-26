package com.xworkz.Constructor;

public class TestBike {

	public static void main(String[] args) {
		Bike RX = new Bike("Yamaha", 200000, "Red");
		System.out.println("Company : " + RX.Company);
		System.out.println("Price : " + RX.Price);
		System.out.println("Color : " + RX.Color);
		System.out.println();

		Bike Honda = new Bike();
		Honda.Company = "Honda";
		Honda.Price = 150000;
		Honda.Color = "Black";
		System.out.println("Company : " + Honda.Company);
		System.out.println("Price : " + Honda.Price);
		System.out.println("Color : " + Honda.Color);
		System.out.println();

		Bike Pulsar = new Bike(300000, "Black");
		System.out.println("Company : " + Pulsar.Company);
		System.out.println("Price : " + Pulsar.Price);
		System.out.println("Color : " + Pulsar.Color);
	}

}
