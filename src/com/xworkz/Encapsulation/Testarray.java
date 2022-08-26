package com.xworkz.Encapsulation;

public class Testarray {

	public static void main(String[] args) {
		StdArray[] A = new StdArray[5];
		for (int i = 0; i < A.length; i++)
			A[i] = new StdArray();
		A[0].setName("Ani");		A[0].setRollno(10);
		A[0].setSection('F');

		A[1].setName("Rani");
		A[1].setRollno(15);
		A[1].setSection('c');

		A[2].setName("Anil");
		A[2].setRollno(20);
		A[2].setSection('G');
		
		A[3].setName("Liki");
		A[3].setRollno(2);
		A[3].setSection('B');
		
		A[4].setName("Poorvi");
		A[4].setRollno(12);
		A[4].setSection('B');
		
		for (int i = 0; i < A.length; i++)
			System.out.println("Name : "+A[i].getName() + "\n" +
		                       "Rollno :"+A[i].getRollno() + "\n" +
					            "Section :"+A[i].getSection()
					            +"\n");
		

	}

}
