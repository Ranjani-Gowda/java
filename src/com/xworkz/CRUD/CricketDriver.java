package com.xworkz.CRUD;


import com.xworkz.CRUD.DAO.CricketDAO;
import com.xworkz.CRUD.DTO.CricketDTO;
import com.xworkz.CRUD.DAO.CricketDAOImplementation;

public class CricketDriver {

	public static void main(String[] args) {

		CricketDTO dto1 = new CricketDTO();

		dto1.setId(1);
		dto1.setName("ABC");
		dto1.setCaptain("Virat");
		dto1.setCountry("India");
		dto1.setTeamsize(11);
		dto1.setStadium("VS Stadium");
		dto1.setSponsor("VIVO");
		dto1.setNoofteam(5);

		CricketDTO dto2 = new CricketDTO();

		dto2.setId(2);
		dto2.setName("DEF");
		dto2.setCaptain("Dhoni");
		dto2.setCountry("Africa");
		dto2.setTeamsize(10);
		dto2.setStadium("CS Stadium");
		dto2.setSponsor("OPPO");
		dto2.setNoofteam(6);

		CricketDTO dto3 = new CricketDTO();

		dto3.setId(3);
		dto3.setName("GHI");
		dto3.setCaptain("Sachin");
		dto3.setCountry("Australia");
		dto3.setTeamsize(12);
		dto3.setStadium("AR Stadium");
		dto3.setSponsor("MI");
		dto3.setNoofteam(3);

		CricketDTO dto4 = new CricketDTO();

		dto4.setId(4);
		dto4.setName("JKL");
		dto4.setCaptain("Yuvi");
		dto4.setCountry("England");
		dto4.setTeamsize(9);
		dto4.setStadium("PO Stadium");
		dto4.setSponsor("Samsung");
		dto4.setNoofteam(8);
		
		CricketDAO dao = new CricketDAOImplementation();
		
		boolean save = dao.saveCricketDTO(dto1);//saveCricketDTO Method
		dao.saveCricketDTO(dto2);
		dao.saveCricketDTO(dto3);
		dao.saveCricketDTO(null);
		System.out.println(save);
		dao.saveCricketDTO(dto4);
		System.out.println();
		System.out.println("*********************************");
		System.out.println();

		
		System.out.println("Saved " +dao.dtos[0]);//saveCricketDTO Method
		System.out.println("Saved " +dao.dtos[1]);
		System.out.println("Saved " +dao.dtos[2]);
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		System.out.println(dao.saveCricketDTO(null));//saveCricketDTO Method
		System.out.println();
		System.out.println("*********************************");
		System.out.println();

		//Find Duplicate Method
		System.out.println("Running equals method " +dto2.equals(dto2)); 
		System.out.println("Running equals method " +dto1.equals(dto2));
		System.out.println("Running equals method " +dto2.equals(dto3));
		System.out.println("Running equals method " +dto1.equals(dto3));
		System.out.println(dto1.equals(null)); // not getting op
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		boolean duplicate = dao.findDuplicate(dto1);
		System.out.println("Whether duplicate is present " +duplicate); //not getting op
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		//Find findteambyCountryName Method
		CricketDTO found = dao.findteambyCountryName("Africa");
		dao.findteambyCountryName("India");
		dao.findteambyCountryName("Australia");
		dao.findteambyCountryName("US");
		dao.findteambyCountryName(null);
		System.out.println(found);
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		//findteambyCountryNameandCaptain method
		CricketDTO find = dao.findteambyCountryNameandCaptain("India", "Virat");
		dao.findteambyCountryNameandCaptain("Africa", "Dhoni");
		dao.findteambyCountryNameandCaptain("Australia", "Sachin");
		dao.findteambyCountryNameandCaptain("UAE", "Liki");
		dao.findteambyCountryNameandCaptain(null, null);
        System.out.println(find);
        System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		//findteambyCountryNameandCaptainandSponsor method
		CricketDTO find1 = dao.findteambyCountryNameandCaptainandSponsor("India", "Virat", "VIVO");
		dao.findteambyCountryNameandCaptainandSponsor("Africa", "Dhoni", "OPPO");
		dao.findteambyCountryNameandCaptainandSponsor("Australia", "Sachin", "MI");
		dao.findteambyCountryNameandCaptainandSponsor(null, null, null);
		System.out.println(find1);
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
				
		//findNoOfTeams method
		dao.findNoOfTeams();
		System.out.println();
		System.out.println();
		System.out.println("*********************************");
		System.out.println();

		
	  // updateTeamByCaptain
        CricketDTO A = dao.updateTeamByCaptain("Virat", dto1);
	    System.out.println(A);System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		dao.deleteTeamByStadium("CS Stadium");
		dao.deleteTeamByStadium("VS Stadium");
		dao.deleteTeamByStadium("AR Stadium");
		dao.deleteTeamByStadium("JH Stadium");
		dao.deleteTeamByStadium(null);
		
		
		
		
		
		
		System.out.println();
		System.out.println("*********************************");
		System.out.println();

	}

}
