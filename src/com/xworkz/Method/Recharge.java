package com.xworkz.Method;

public class Recharge {
	public static void recharge(long phoneNumber, int amount, String operator) {
		if (operator == "Airtel") {
			System.out.println(operator);
		} else if (operator == "Vodafone") {
			System.out.println(operator);
		} else if (operator == "Jio") {
			System.out.println(operator);
		}
	}

	public static void main(String[] args) {
		Recharge.recharge(8942351208l, 50, "Jio");
	}
}
