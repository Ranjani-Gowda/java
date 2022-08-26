package com.xworkz.Method;

public class LoginPage {

	public static void userLogin(int password) {
		int pwd = 12345;
		if (password == pwd) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Incorrect Password");
		}
	}

	public static void main(String args[]) {
		LoginPage.userLogin(123456);
	}

}
