package com.xworkz.Encapsulation;

public class Studentpr {
	protected String name;
	protected int rollno;
	protected char section;

	Studentpr() {
		System.out.println("Student Description");
	}

	Studentpr(String name, int rollno, char section) {
		System.out.println("Student Description");
		this.name = name;
		this.rollno = rollno;
		this.section = section;
	}

	public void reg() {
		System.out.println("Registration Successfull");
	}
}
