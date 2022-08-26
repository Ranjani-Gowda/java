package com.xworkz.Method;

public class AreaofCircle {
	public static void areaOfCircle(double pi, int radius) {
		double area = pi * (radius * radius);
		System.out.println(area);
	}

	public static void main(String[] args) {
		AreaofCircle.areaOfCircle(3.14, 5);
	}

}
