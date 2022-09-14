package com.xworkz.waterbottle.exception;

public class InvalidEx extends Exception {
	
	public InvalidEx(String message) {
		System.out.println(message);
		System.out.println("Cannot save");
	}
}



