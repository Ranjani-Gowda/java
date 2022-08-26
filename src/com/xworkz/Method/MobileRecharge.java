package com.xworkz.Method;

public class MobileRecharge {
	public static void mobileRecharge(long phoneNumber, int amount, String operator) {
		if (operator == "Airtel") {
			System.out.println(operator + " " + phoneNumber + " Recharge done for the amount of " + amount);
		} else if (operator == "Jio") {
			System.out.println(operator + " " + phoneNumber + " Recharge done for the amount of " + amount);
		} else if (operator == "Vodafone") {
			System.out.println(operator + " " + phoneNumber + " Recharge done for the amount of " + amount);

		}
	}

	public static void main(String args[]) {
		MobileRecharge.mobileRecharge(7845213684l, 100, "Airtel");
	}
}
