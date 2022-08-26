package com.xworkz.ControlStatements;

public class PersonalTax {

	public static void main(String[] args) {
    int salary = 2000000;
    if(salary<=500000) {
    	System.out.println("Payable tax is 200 per month");
    }else if (salary>500000 && salary<=1000000) {
    System.out.println("Payable tax is 1000 per month");
	}else if(salary>1000000 && salary<=1500000) {
	System.out.println("Payable tax is 5000 per month");
	}else {
		System.out.println("Payable tax is 10000 per month");
	}
	}
	}
