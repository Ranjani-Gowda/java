package com.xworkz.Constructor;

public class TestShoes {

	public static void main(String[] args) {
		Shoes Puma = new Shoes("Puma", 2000, 8);
		System.out.println("Brand : " + Puma.Brand);
		System.out.println("Price : " + Puma.Price);
		System.out.println("Size : " + Puma.Size);
		System.out.println();

		Shoes Fila = new Shoes();
		Fila.Brand = "Fila";
		Fila.Price = 1500;
		Fila.Size = 7;
		System.out.println("Brand : " + Fila.Brand);
		System.out.println("Price : " + Fila.Price);
		System.out.println("Size : " + Fila.Size);
		System.out.println();

		Shoes Nike = new Shoes("Nike", 9);
		System.out.println("Brand : " + Nike.Brand);
		System.out.println("Size : " + Nike.Size);
		System.out.println("Price : " + Nike.Price);

	}

}
