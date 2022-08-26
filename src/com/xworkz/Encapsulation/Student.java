package com.xworkz.Encapsulation;

public class Student {
	String name;
	int rollno;
	char section;

	Student() {
		System.out.println("Student Description");
	}

	Student(String name, int rollno, char section) {
		System.out.println("Student Description");
		this.name = name;
		this.rollno = rollno;
		this.section = section;
	}
}
