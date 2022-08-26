package com.xworkz.Encapsulation;

public class StdArray {
	String name;
	int rollno;
	char section;

	public void Student(String name, int rollno, char section) {
		this.name = name;
		this.rollno = rollno;
		this.section = section;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

}
