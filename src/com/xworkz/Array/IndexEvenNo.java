package com.xworkz.Array;

public class IndexEvenNo {

	public static void main(String[] args) {
     int number[]= {11,21,35,44,85,86,97,78,9,10,11,12,13,14,15,16,17,18,19,20};
	 System.out.println("The Index Even Numbers are\n");
     for(int i=0;i<20;i++) {
    	 if(number[i]%2==0) {
    		 System.out.println(number[i]);
    	 }
     }
	}

}


