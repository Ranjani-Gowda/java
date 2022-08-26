package com.xworkz.Method;

public class SmartWatch {

	public static void heartbeat() {
		System.out.println("Rate of Heart Beat is normal");
	}
	public static void steps() {
		System.out.println("No of steps is 500");
	}
	public static void call() {
		System.out.println("Recieve the call");
	}
	public static void message() {
		System.out.println("Unread message");
	}
public static void main(String[]args) {
	int num=1;
	switch(num) {
	case 1: SmartWatch.heartbeat();
	break;
	case 2: SmartWatch.steps();
	break;
	case 3: SmartWatch.call();
	break;
	case 4: SmartWatch.message();
	}
}
}
