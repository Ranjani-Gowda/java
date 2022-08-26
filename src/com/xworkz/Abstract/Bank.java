package com.xworkz.Abstract;

public abstract class Bank {

	String name;
	String place;
	int pincode;
	String branch;

	public Bank(String name, String place, int pincode, String branch) {
		this.name = name;
		this.place = place;
		this.pincode = pincode;
		this.branch = branch;
	}

	public void noOfEmp() {
		System.out.println("No of Employees are 600");
	}

	public void year() {
		System.out.println("Started from the year 1980");
	}

	public static void workingHours() {
		System.out.println("Working hours is 8 hours");
	}

	public abstract void loanProcedure();

	public abstract void rateOfInterest();

}
