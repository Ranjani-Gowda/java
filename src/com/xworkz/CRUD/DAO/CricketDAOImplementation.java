package com.xworkz.CRUD.DAO;

import com.xworkz.CRUD.DTO.CricketDTO;



public class CricketDAOImplementation extends CricketDAO {

	@Override
	public CricketDTO updateTeamByCaptain(String Captain, CricketDTO dto) {

		if (Captain == null && dto == null) {
			System.out.println("The object is null");
			return null;
		}

		CricketDTO[] superArray = super.getDtos();

		for (int i = 0; i < superArray.length; i++) {

			if (superArray[i] != null && superArray[i].getCaptain().equals(Captain)) {
				superArray[i] = dto;
				System.out.println("New DTO is updated at index " + i);
				return superArray[i];
			}
		}
		System.out.println("Captain not found");
		return null;
	}

	@Override
	public  CricketDTO deleteTeamByStadium(String Stadium) {

		if (Stadium == null) {
			System.out.println("The object is null");
			return null;
		}

		CricketDTO[] superArray = super.getDtos();

		for (int i = 0; i < superArray.length; i++) {

			if (superArray[i] != null && superArray[i].getStadium().equals(Stadium)) {
				superArray[i] = null;
				System.out.println("DTO is deleted at index " + i);
				return superArray[i];
			}
		}
		System.out.println("Not found");
		return null;
	}

	
	
}
