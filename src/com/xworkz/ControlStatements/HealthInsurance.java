package com.xworkz.ControlStatements;

public class HealthInsurance {

	public static void main(String[] args) {
    int age=60;
    if(age<=18) {
    	System.out.println("Premium amount is 10000");
    }else if(age>18 && age<=30) {
    	System.out.println("Premium amount is 20000");
    }else if (age>30 && age<=50) {
    	System.out.println("Premium amount is 30000");
    }else
    	System.out.println("Premium amount is 50000");
	}

}
