package com.xworkz.Inheritance.Multilevel;

public class TVtest {

	public static void main(String[] args) {
		TV_1 A = new TV_1();
		System.out.println("Year : "+A.year);
		A.picture();
		System.out.println();

		
		TV_2 B = new TV_2();
		System.out.println("Year : "+B.year1);
		B.picture1();
		System.out.println();

		TV_3 C = new TV_3();
		System.out.println("Year : "+C.year2);
		C.picture2();

	}

	
}
