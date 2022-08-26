package com.xworkz.Polymorphism;

public class ApplicationOR {
	ApplicationOR() {
		System.out.println("Inside Application Constructor");
	}

	public void login() {
		System.out.println("Login Successfull");
	}

	public void showTime() {
		System.out.println("24 hour format");
		System.out.println("15:30");
	}

	public void showTemp(String location) {
		System.out.println("Display Temperature in F");
		System.out.println("80 F");
	}

	public void showDate() {
		System.out.println("Display Date in DD/MM/YYYY Format");
		System.out.println("03/08/2022");
	}
}
