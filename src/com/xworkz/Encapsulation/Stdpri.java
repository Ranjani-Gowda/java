package com.xworkz.Encapsulation;

public class Stdpri {
	private String name;
	private int rollno;
	private char section;

	public void setNme(String name) {
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

	public void test() {
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.section);
	}
}
