package com.xworkz.Method;

public class Test {
	public static int[] sendArrayElement() {

		int regNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		return regNum;
	}

	public static void main(String[] args) {
		int a[] = Test.sendArrayElement();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
