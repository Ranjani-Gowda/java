package com.xworkz.ConstructorChaining;

public class SamsungMobileCharger extends MobileCharger {

	public SamsungMobileCharger(String voltage) {
		super("5v", 200.0, "Black", "5cm");
		System.out.println("Samsung mobile charger");
		System.out.println();
	}

	@Override
	public void charging() {
		super.charging();
		System.out.println("Samsung mobile is charging");
		System.out.println("color of charger is "+this.color);
		System.out.println();
	}
}
