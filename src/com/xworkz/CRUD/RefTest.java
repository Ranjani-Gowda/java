package com.xworkz.CRUD;
import com.xworkz.CRUD.RefDTO;

public class RefTest {
	
	public static void main (String[] args) {
		
		RefDTO A = new RefDTO();
		A.setCompany("Samsumg");
		A.setModel("SAM-2000");
		A.setDoor("Single Door");
		A.setPrice(10000);
	
		RefDTO B = new RefDTO();
		B.setCompany("LG");
		B.setModel("LG-5000");
		B.setDoor("Double Door");
		B.setPrice(20000);
		
		RefDTO C = new RefDTO();
		C.setCompany("Haier");
		C.setModel("HA-500");
		C.setDoor("Slide Door");
		C.setPrice(40000);

		RefDTO D = new RefDTO();
		D.setCompany("Godrej");
		D.setModel("G-8000");
		D.setDoor("French Door");
		D.setPrice(70000);

		//DAO.saveRefDTO(A);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}

}
