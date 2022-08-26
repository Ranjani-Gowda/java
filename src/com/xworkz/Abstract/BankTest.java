package com.xworkz.Abstract;

public class BankTest {

	public static void main(String[] args) {
		Bank A = new SBI();
		System.out.println(A.name);
		System.out.println(A.branch);
		System.out.println(A.place);
		System.out.println(A.pincode);
		A.workingHours();
		A.loanProcedure();
		A.noOfEmp();
		A.rateOfInterest();
		System.out.println("*****************************");

		Bank B = new ICICI();
		System.out.println(B.name);
		System.out.println(B.branch);
		System.out.println(B.place);
		System.out.println(B.pincode);
		B.workingHours();
		B.loanProcedure();
		B.noOfEmp();
		B.rateOfInterest();
		System.out.println("*****************************");

		Bank C = new Axis();
		System.out.println(C.name);
		System.out.println(C.branch);
		System.out.println(C.place);
		System.out.println(C.pincode);
		C.workingHours();
		C.loanProcedure();
		C.noOfEmp();
		C.rateOfInterest();
		System.out.println("*****************************");

		Bank D = new Canara();
		System.out.println(D.name);
		System.out.println(D.branch);
		System.out.println(D.place);
		System.out.println(D.pincode);
		D.workingHours();
		D.loanProcedure();
		D.noOfEmp();
		D.rateOfInterest();
		System.out.println("*****************************");

	}

}
