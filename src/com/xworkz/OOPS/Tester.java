package com.xworkz.OOPS;

public class Tester {

	public static void main(String[] args) {
		String statement = "Coorg is Kashmir of Karnataka";
		String name = "Place";
		char charAt = statement.charAt(10);
		System.out.println(charAt);
		int codePointAt = statement.codePointAt(11);
		System.out.println(codePointAt);
		int codePointBefore = statement.codePointBefore(15);
		System.out.println(codePointBefore);
		int length = statement.length();
		System.out.println(length);
		int hashCode = statement.hashCode();
		System.out.println(hashCode);
		String toLowerCase = statement.toLowerCase();
		System.out.println(toLowerCase);
		String toUpperCase = statement.toUpperCase();
		System.out.println(toUpperCase);
		int compareTo = statement.compareTo(name);
		System.out.println(compareTo);
		String trim = statement.trim();
		System.out.println(trim);
		String concat = statement.concat(" : " + name);
		System.out.println(concat);

	}
}