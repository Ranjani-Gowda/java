package com.xworkz.Polymorphism;

public class Testbank {

	public static void main(String[] args) {
		Bank SBI = new Bank();
		SBI.payment(8527419631l, 10000);
		SBI.payment(7531345891L, "Likith");
		SBI.payment("BGD1275", 14782130);
		SBI.payment(147953175L, "Likith", 500000);

	}

}
