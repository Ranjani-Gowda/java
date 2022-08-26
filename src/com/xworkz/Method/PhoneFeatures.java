package com.xworkz.Method;

public class PhoneFeatures {

	public static void internet() {
		System.out.println("Internet is on");
	}
	public static void bluetooth() {
		System.out.println("Bluetooth connection Enabled");
	}
	public static void torch() {
		System.out.println("Torch is off");
	}
	public static void main(String[] args) {
		int num=2;
		switch (num) {
		case 1: PhoneFeatures.internet();
		break;
		case 2: PhoneFeatures.bluetooth();
		break;
		case 3: PhoneFeatures.torch();
		}
	}
}
