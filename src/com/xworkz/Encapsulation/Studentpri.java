package com.xworkz.Encapsulation;

public class Studentpri {
	private String name;
	private int rollno;
	private char section;

	public void B() {
		System.out.println("Student Description");
	
	}
	public void setNme(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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