package com.xworkz.CRUD.DAO;

import com.xworkz.CRUD.DTO.CricketDTO;

public abstract class CricketDAO {

	public CricketDTO[] dtos = new CricketDTO[3];
	int index = 0;

	public boolean saveCricketDTO(CricketDTO dto) {

		if (dto == null) {
			System.out.println("DTO is null cannot be saved");
			return false;
		}

		boolean isFound = findDuplicate(dto);
		if (isFound) {
			System.out.println("DTO is duplicate cannot be saved");
			return false;
		}

		if (this.index < dtos.length) {
			this.dtos[index] = dto;
			System.out.println("Saved DTO in index " + this.index);
			this.index++;

			return true;

		} else {
			System.out.println("DTO Array is full cannot be saved");
			return false;
		}
	}

	public boolean findDuplicate(CricketDTO dto) {

		if (dto == null) {
			System.out.println("DTO is null cannot run equals method");
			return false;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].equals(dto)) {
				System.out.println("Duplicate is found in the array");
				return true;
			}
		}
		return false;
	}

	public CricketDTO findteambyCountryName(String CountryName) {

		if (CountryName == null) {
			System.out.println("Name is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getCountry().equals(CountryName)) {
				System.out.println("Country Name is found at index " + i);
				return this.dtos[i];
			}
		}
		return null;
	}

	public CricketDTO findteambyCountryNameandCaptain(String CountryName, String Captain) {

		if (CountryName == null && Captain == null) {
			System.out.println("Name and Captain is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getCountry().equals(CountryName)
					&& this.dtos[i].getCaptain().equals(Captain)) {
				System.out.println("Country Name and Captain is found at index " + i);
				return this.dtos[i];
			}
		}
		return null;
	}

	public CricketDTO findteambyCountryNameandCaptainandSponsor(String CountryName, String Captain, String Sponsor) {

		if (CountryName == null && Captain == null && Sponsor == null) {
			System.out.println("Name and Captain is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getCountry().equals(CountryName)
					&& this.dtos[i].getCaptain().equals(Captain) && this.dtos[i].getSponsor().equals(Sponsor)) {
				System.out.println("Country Name, Captain and Sponsor is found at index " + i);
				return this.dtos[i];
			}
		}
		return null;
	}

	public void findNoOfTeams() {
		int count = 0;
		
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null ) {
				count++;
			}
		}
		System.out.println("Number of teams are " + count);

	}

	public abstract CricketDTO updateTeamByCaptain(String Captain, CricketDTO dto);

	public abstract CricketDTO deleteTeamByStadium(String Stadium);

	public CricketDTO[] getDtos() {
		return dtos;
	}

}
