package com.xworkz.Polymorphism;

public class Dominos {
	public void Pizza (String name, String size,int amount) {
		System.out.println("Regular Size Corn Pizza is Ordered ");
	}
	public void Pizza (String size,int amount ) {
		System.out.println("Medium Size Cpsicum Pizza is Ordered ");
	}
	public void Pizza (String name,int amount,int slice) {
		System.out.println("Large Size Chicken Pizza is Ordered ");
	}
}
