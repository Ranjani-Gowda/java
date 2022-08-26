package com.xworkz.Polymorphism;

public class TestAmazon {

	public static void main(String[] args) {
		Amazon A = new Amazon();
		A.filter("Womens Clothing", 500);
		A.filter("Kitchen Appliances", "50%");
		A.filter("Kids Clothing", 299, 439703);
	}

}
