package com.xworkz.Encapsulation;

public class Stdgt {
	private String name;
	private int rollno;
	private char section;

	public void B() {
		System.out.println("Student Description");

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		if (rollno < 20) {
			this.rollno = rollno;
		} else

		{
			System.out.println("Roll no shold be less than 20");
		}
	}

	public void setSection(char section) {
		this.section = section;
	}

	public String getName() {
		return this.name;
	}
	public int getRollno() {
		return this.rollno;
	}
	public char getSection() {
		return this.section;
	}
}
