package com.xworkz.Abstract;

public class ICICI extends Bank {

	public ICICI() {
		super("ICICI Bank", "Mandya", 571401, "V.V Road");
		System.out.println("ICICI Bank Details");
	}

	@Override
	public void loanProcedure() {
		System.out.println("Income should be more than 50000");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 7%");
	}

}
