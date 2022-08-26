package com.xworkz.Abstract;

public class Axis extends Bank {

	public Axis() {
		super("Axis Bank", "Bangalore", 578123, "Jaynagar");
		System.out.println("Axis Bank Details");
	}

	@Override
	public void loanProcedure() {
		System.out.println("Person should be taking salary");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 9%");
	}
}
