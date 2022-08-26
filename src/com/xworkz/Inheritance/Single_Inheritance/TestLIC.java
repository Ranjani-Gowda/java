package com.xworkz.Inheritance.Single_Inheritance;

public class TestLIC {

	public static void main(String[] args) {
		Nominee Sam = new Nominee();
		System.out.println("Maturity amount : "+Sam.amount);
		Sam.money();
		System.out.println("Age of Nominee : " +Sam.ageofnominee);
		System.out.println("Name of Nominee : "+Sam.name);
		Sam.maturity();

	}

}
