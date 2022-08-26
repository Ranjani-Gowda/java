package com.xworkz.OOPS;

public class Shoes {
String color;
String company;
int price;
int size;
public static void main (String[] args) {
	
	Shoes Puma = new Shoes();
    Puma.company = "Puma";
    Puma.color = "Black";
    Puma.price = 2000;
    Puma.size = 6;
    
    System.out.println(Puma.company);
    System.out.println(Puma.color);
    System.out.println("Size:" + Puma.size);
    System.out.println(Puma.price);
    System.out.println();
    
    
    Shoes Nike = new Shoes();
    Nike.company = "Nike";
    Nike.color = "White";
    Nike.size = 7;
    Nike.price = 2500;
    
    Nike.price = 1500;
    System.out.println(Nike.company);
    System.out.println(Nike.color);
    System.out.println(Nike.size);
    System.out.println(Nike.price);
    System.out.println();
 
    Shoes Adidas = new Shoes();
    Adidas.company = "Adidas";
    Adidas.color = "Red";
    Adidas.price = 3000;
    Adidas.size = 8;

    System.out.println(Adidas.company);
    System.out.println(Adidas.color);
    System.out.println(Adidas.size);
    System.out.println(Adidas.price);


    
}

}
