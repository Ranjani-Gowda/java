package com.xworkz.Method;

public class Temp {
public static double getTemperature() {
	
	return 30.53;
}
public static void entryCheck(double temp) {
	if(temp>50.0) {
		System.out.println("Entry Provided");
	}else {
		System.out.println("No Entry");
	}
}
public static void main (String[] args) {
	double temp = Temp.getTemperature();
	Temp.entryCheck(temp);
}
}
