package com.xworkz.Method;

public class BookMyShow {

	public static void booking() {
		System.out.println("Ticket booking Confirmed");
}
	public static void members() {
		System.out.println("Ticket is booked for 5 members");
	}
	public static void cancel() {
		System.out.println("Booking is Cancelled");
	}
	public static void main(String args[]) {
		int num=3;
		switch (num) {
		case 1: BookMyShow.booking();
		break;
		case 2: BookMyShow.members();
		break;
		case 3: BookMyShow.cancel();
		break;
		}
	}

}
