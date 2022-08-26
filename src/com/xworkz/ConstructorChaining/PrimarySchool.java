package com.xworkz.ConstructorChaining;

public class PrimarySchool extends School {

	public PrimarySchool(String name) {
		super("Santhome Public Shool", 500, "Mandya");
		System.out.println("Primary School");
	}

	@Override
	public void schools() {
		super.schools();
		System.out.println("Primary School");
		System.out.println("name of school is "+this.name);
		
		
	}
	
}
