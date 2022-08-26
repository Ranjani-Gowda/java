package com.xworkz.CRUD.DTO;

public class CricketDTO {

	private int id;
	private String name;
	private String captain;
	private int teamsize;
	private String sponsor;
	private String stadium;
	private String Country;
	private int noofteam;

	@Override
	public String toString() {
		return "CricketDTO [ID = " + id + ", Name = " + name + ", Captain = " + captain + ","
				+ "" + " Teamsize = " + teamsize + ", Sponsor = " + sponsor + ", " 
				+ "Stadium = " + stadium + ", Country = " + Country + ", "
				+ "No of Team = " + noofteam + "]";
	}

	public int getNoofteam() {
		return noofteam;
	}

	public void setNoofteam(int noofteam) {
		this.noofteam = noofteam;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CricketDTO other = (CricketDTO) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (captain == null) {
			if (other.captain != null)
				return false;
		} else if (!captain.equals(other.captain))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noofteam != other.noofteam)
			return false;
		if (sponsor == null) {
			if (other.sponsor != null)
				return false;
		} else if (!sponsor.equals(other.sponsor))
			return false;
		if (stadium == null) {
			if (other.stadium != null)
				return false;
		} else if (!stadium.equals(other.stadium))
			return false;
		if (teamsize != other.teamsize)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCaptain() {
		return captain;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public String getSponsor() {
		return sponsor;
	}

	public String getStadium() {
		return stadium;
	}

	public String getCountry() {
		return Country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public void setCountry(String country) {
		Country = country;
	}

}