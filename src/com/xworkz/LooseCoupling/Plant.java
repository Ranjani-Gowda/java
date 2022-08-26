package com.xworkz.LooseCoupling;

public class Plant {
	static double height = 5.7;
	static int age = 5;

	public static void main(String[] args) {
		height = 5;
		System.out.println(height);
		// widening - converting higher dt to lower dt
		age = (int) 5.7;
		System.out.println(age);
		// narrowing - converting lower dt to higer dt
	}
}
