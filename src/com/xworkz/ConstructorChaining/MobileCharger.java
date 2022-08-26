package com.xworkz.ConstructorChaining;

public class MobileCharger {
	public String voltage;
	public double price;
	public String color;
	public String size;

	public MobileCharger() {
		System.out.println("Mobile charger 1");
		System.out.println();
	}

	public MobileCharger(String voltage) {
		this();
		this.voltage = voltage;
		System.out.println("Mobile charger 2");
		System.out.println();
	}

	public MobileCharger(String voltage, double price) {
		this(voltage);
		this.price = price;
		System.out.println("Mobile charger 3");
		System.out.println();
	}

	public MobileCharger(String voltage, double price, String color, String size) {
		this(voltage, price);
		this.color = color;
		this.size = size;
		System.out.println("Mobile charger 4");
		System.out.println();
	}
	public void charging() {
		System.out.println("Mobile is charging");
		System.out.println();
	}
}