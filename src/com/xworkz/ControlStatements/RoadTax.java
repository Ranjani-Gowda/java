package com.xworkz.ControlStatements;

public class RoadTax {

	public static void main(String[] args) {
    // 1.Karnataka 2.Tamilnadu 3.Andrapradesh 4.Bombay 5.Kerala
		int StateCode=6;
		if(StateCode==1) {
			System.out.println("1 Lakh INR");
		}
		else if(StateCode==2) {
			System.out.println("85000 INR");
		}
		else if(StateCode==3) {
			System.out.println("75000 INR");
		}
		else if(StateCode==4) {
			System.out.println("65000 INR");
		}
		else if(StateCode==5) {
			System.out.println("50000 INR");
		}
		else {
			System.out.println("Invalid State Code");
		}
	}

}
