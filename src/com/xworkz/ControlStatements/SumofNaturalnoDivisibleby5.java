package com.xworkz.ControlStatements;

public class SumofNaturalnoDivisibleby5 {

	public static void main(String[] args) {
    int sum = 0;
    for(int i=0;i<=50;i++) {
    	if(i%5==0) {
    		sum=sum+i;
    	}
    }
    System.out.println(sum);
    	}
}