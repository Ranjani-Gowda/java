package com.xworkz.ConstructorChaining;

public class SchoolTest extends School {

	public static void main(String[] args) {
		String B = "Santhome Public School";
		School s = new School("Santhome Public School", 1000, "Mandya");
		System.out.println(s.name);
		System.out.println(s.noOfStudents);
		System.out.println(s.place);
		System.out.println();
		
		PrimarySchool p = new PrimarySchool(B);
		
		School b = new School("Carmel", 400);
		System.out.println("Calling main method");
        SchoolTest.main(B);
	}
	public static void main(String args) {
		System.out.println("Calling main method 2");

}
}
