package com.xworkz.Array;

public class IndexOddNo {

	public static void main(String[] args) {
    int number[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    System.out.println("The Index Odd Numbers are\n");
    for(int i=0;i<15;i++) {
    	if(number[i]%2!=0) {
    		System.out.println(number[i]);    	}
    }
	}

}
