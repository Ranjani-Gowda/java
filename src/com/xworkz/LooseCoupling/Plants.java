package com.xworkz.LooseCoupling;

public class Plants {
	int age;
	double height;
	String color;

	public Plants() {
		System.out.println("Non Parameter Constructor of parent class");
	}

	public Plants(int age, double height, String color) {
		this.age = age;
		this.height = height;
		this.color = color;
		System.out.println("Parameter Constructor of parent class");

	}

	void givesFruit() {
		System.out.println("Gives fruits");
	}
}