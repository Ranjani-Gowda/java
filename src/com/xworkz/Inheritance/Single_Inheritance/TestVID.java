package com.xworkz.Inheritance.Single_Inheritance;

public class TestVID {
	public static void main(String[] args) {
		VID Adult = new VID();
		Adult.name = "Likith";
		Adult.gender = 'M';
		Adult.age = 20;
		Adult.voterIDno = "PFRG1482";

		System.out.println(Adult.name);
		System.out.println(Adult.age);
		System.out.println(Adult.gender);
		System.out.println(Adult.voterIDno);
		System.out.println(Adult.Dob);
		System.out.println(Adult.Place);
		Adult.agecriteria();
		Adult.vote();

	}

}
