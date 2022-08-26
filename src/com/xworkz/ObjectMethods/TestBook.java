package com.xworkz.ObjectMethods;

public class TestBook {

	public static void main(String[] args) {
     Book b = new Book();
     
     Book b1 = new Book("Maths", "State", 500, 2001);
     
     Book b2 = new Book("Science", "State", 399, 2001);
     
     System.out.println(b.toString()); 
     
     System.out.println(b); 
     
     System.out.println(b1);
     
     System.out.println(b.hashCode());
     
     System.out.println(b1.hashCode());
     
     System.out.println(System.identityHashCode(b));
     
     System.out.println(System.identityHashCode(b1));
     
     //System.out.println(b.equals(b1));
     
     //System.out.println(b1.equals(b2));
     
    // System.out.println(b1.equals(null));
     
     System.out.println(b1 == b2);
     
     
     //String author = "Shakespeare";
     System.out.println(b1.equals(b2));
	}
	

}
