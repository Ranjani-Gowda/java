package com.xworkz.Abstract;

public class Canara extends Bank {

	public Canara() {
		super("Canara Bank", "Madkeri", 589145, "Madkeri");
		System.out.println("Canara Bank Details");
	}

	@Override
	public void loanProcedure() {
		System.out.println("Should submit original proof");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 12%");
	}

}
