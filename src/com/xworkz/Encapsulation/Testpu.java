package com.xworkz.Encapsulation;

public class Testpu {

	public static void main(String[] args) {
		Studentpu A = new Studentpu("Anu", 5, 'A');
		A.reg();
		System.out.println("Name = " + A.name);
		System.out.println("Rollno = " + A.rollno);
		System.out.println("Section = " + A.section);

	}

}
