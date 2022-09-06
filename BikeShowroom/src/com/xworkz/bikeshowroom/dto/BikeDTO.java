package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

public class BikeDTO implements Serializable {

	private String name;
	private String location;
	private long phno;
	private long gstNo;
	private ScooterDTO scooterDTO;

	public BikeDTO() {

	}

	public BikeDTO(String name, String location, long phno, long gstNo, ScooterDTO scooterDTO) {
		super();
		this.name = name;
		this.location = location;
		this.phno = phno;
		this.gstNo = gstNo;
		this.scooterDTO = scooterDTO;
	}
	
	@Override
	public String toString() {
		return "BikeDTO [name=" + name + ", location=" + location + ", phno=" + phno + ", gstNo=" + gstNo
				+ ", scooterDTO=" + scooterDTO + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BikeDTO other = (BikeDTO) obj;
		if (gstNo != other.gstNo)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phno != other.phno)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public long getGstNo() {
		return gstNo;
	}

	public void setGstNo(long gstNo) {
		this.gstNo = gstNo;
	}

	public ScooterDTO getScooterDTO() {
		return scooterDTO;
	}

	public void setScooterDTO(ScooterDTO scooterDTO) {
		this.scooterDTO = scooterDTO;
	}

}
