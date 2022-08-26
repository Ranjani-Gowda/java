package com.xworkz.Method;

public class FindANum {
	public static boolean findNumber(int a[], int se) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] == se) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int regNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int searchElement = 16;
		boolean result = FindANum.findNumber(regNum, searchElement);
		if (result) {
			System.out.println("Number Found");
		} else {
			System.out.println("Number not Found");
		}
	}
}
