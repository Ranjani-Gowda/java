package com.xworkz.ConstructorChaining;

public class School {
	public String name;
	public int noOfStudents;
	public String place;

	public School() {
		System.out.println("School");
	}

	public School(String name) {
		this();
		this.name = name;
		System.out.println("School 1");
	}

	public School(String name, int noOfStudents) {
		this(name);
		this.noOfStudents = noOfStudents;
		System.out.println("School 2");
	}

	public School(String name, int noOfStudents, String place) {
		this(name, noOfStudents);
		this.place = place;
		System.out.println("School 3");
	}

	public void schools() {
		System.out.println("State syllabus School");
	}

}
