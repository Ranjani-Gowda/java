package com.xworkz.Inheritance.Hierarchy;

public class Malltest {

	public static void main(String[] args) {
Mall A = new Mall(); 
System.out.println("Name :"+A.name);	
System.out.println("No of Shops :"+A.noofshops);	
System.out.println("No of Floors :"+A.floor);	
System.out.println("Place :"+A.place);	
A.mall();
System.out.println();

GF B = new GF();
System.out.println(B.floor1);
System.out.println("No of Shops :"+B.shop1);
B.GF1();
System.out.println();

FF C = new FF();
System.out.println(C.floor2);	
System.out.println("No of Shops :"+C.shop2);
C.FF1();
System.out.println();

SF D = new SF();
System.out.println(D.floor3);	
System.out.println("No of Shops :"+D.shop3);
D.SF1();
System.out.println();

TF E = new TF();
System.out.println(E.floor4);	
System.out.println("No of Shops :"+E.shop4);
E.TF1();
System.out.println();










	

	}

}
