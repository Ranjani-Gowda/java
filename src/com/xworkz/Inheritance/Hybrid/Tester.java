package com.xworkz.Inheritance.Hybrid;

public class Tester {

	public static void main(String[] args) {
		Pharma A = new Pharma();
		System.out.println("Pharma name :" + A.name);
		System.out.println("Place :" + A.place);
		System.out.println();

		Drug B = new Drug();
		B.d();
		System.out.println();

		Tablets C = new Tablets();
		C.m();
		System.out.println();

		Syrup D = new Syrup();
		D.s();
		System.out.println();

		Others E = new Others();
		E.m();

	}

}
