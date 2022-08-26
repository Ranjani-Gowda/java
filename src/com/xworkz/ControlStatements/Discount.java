package com.xworkz.ControlStatements;

public class Discount {

	public static void main(String[] args) {
    int purchase = 12000;
    if(purchase==3000) {
    	System.out.println("Will Avail 10% Discount");
    }else if (purchase>3000 && purchase<=5000) {
    	System.out.println("Will Avail 15% Discount");
    }else if(purchase>5000 && purchase<=8000) {
    	System.out.println("Will Avail 20% Discount");
    }else if(purchase>8000 && purchase<=10000) {
    	System.out.println("Will Avail 25% Discount");
    }else {
    	System.out.println("Will Avail 30% Discount");

    }
    

	}

}
