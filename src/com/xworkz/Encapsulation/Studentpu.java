package com.xworkz.Encapsulation;

public class Studentpu {
	public String name;
	public int rollno;
	public char section;

	Studentpu() {
		System.out.println("Student Description");
	}

	Studentpu(String name, int rollno, char section) {
		System.out.println("Student Description");
		this.name = name;
		this.rollno = rollno;
		this.section = section;
	}
	public void reg() {
		System.out.println("Registration Successfull");
	}

}
