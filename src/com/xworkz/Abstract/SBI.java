package com.xworkz.Abstract;

public class SBI extends Bank {
	
	public SBI() {
	super("SBI","Mysore", 571003, "Kuvempu Nagar");
	System.out.println("SBI Bank Details");
	}

	@Override
	public void loanProcedure() {
		System.out.println("Need to give proper documents for loan approval");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 5%");
	}
}
