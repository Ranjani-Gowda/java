package com.xworkz.ControlStatements;

public class HotelGrand {

	public static void main(String[] args) {
// 1.South Indian 2.North Indian 3.Chinese 4.Seafood
		int menu = 7;
		switch(menu) { 
		case 1:  System.out.println("Welcome to South Indian food menu - Dosa,Idli,Bath,Pongal");
		break;
		case 2 : System.out.println("Welcome to North Indian food menu - Roti,Dal,Samosa,Vadapav");
		break;
		case 3 : System.out.println("Welcome to Chinese food menu - Gobi,Noodles,Fried Rice");
		break;
		case 4 : System.out.println("Welcome to Sea Food food menu - Prawns,Fish,Crab ");
        break;
default:System.out.println("Selected invalid Menu");
	}
	}
}
