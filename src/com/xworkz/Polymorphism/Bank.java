package com.xworkz.Polymorphism;

public class Bank {

	public void payment(String cheque, int amount) {
		System.out.println("Payment done through Cheque");
	}

	public void payment(long bankAcno, String name) {
		System.out.println("Payment done through Challan");
	}

	public void payment(long bankAcno, String name, int amount) {
		System.out.println("Payment done through RTGS");
	}

	public void payment(long phno, int amount) {
		System.out.println("Payment done through Internet Banknig");
	}
}
