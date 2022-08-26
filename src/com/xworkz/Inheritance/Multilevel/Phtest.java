package com.xworkz.Inheritance.Multilevel;

public class Phtest {

	public static void main(String[] args) {
		Ph_1 A = new Ph_1();
		System.out.println("Evolution of Phones");
		System.out.println();

		A.founder();
		System.out.println();

		System.out.println("Name of phone : " + A.Name);
		System.out.println("Year :" + A.year);
		System.out.println();

		Ph_2 B = new Ph_2();
		System.out.println("Name of phone : " + B.name1);
		System.out.println("Year :" + B.year1);
		System.out.println();

		Ph_3 C = new Ph_3();
		System.out.println("Name of phone : " + C.name2);
		System.out.println("Year :" + C.year2);

	}

}
