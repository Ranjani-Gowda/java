package com.xworkz.ConstructorChaining;

public class McTest {
	public static void main(String args[]) {
		String volts = "5v";
		MobileCharger m = new MobileCharger("10v", 100.0, "White", "White");
		System.out.println(m.voltage);
		System.out.println(m.price);
		System.out.println(m.color);
		System.out.println();
		
		SamsungMobileCharger s = new SamsungMobileCharger(volts);
		s.charging();
		
		MobileCharger A = new MobileCharger("5v", 150.00);
		System.out.println("Calling main method");
		System.out.println();
		McTest.main("abc");
	}

	public static void main(String args) {
		System.out.println("Calling main method 2");
	}
}
