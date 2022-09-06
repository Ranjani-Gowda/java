package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

public class ScooterDTO implements Serializable {

	private String company;
	private double price;
	private String color;
	private int cc;
	private SportsBikeDTO sportsBikeDTO;

	public ScooterDTO() {

	}

	public ScooterDTO(String company, double price, String color, int cc,SportsBikeDTO sportsBikeDTO ) {
		System.out.println("Generated - " +this.getClass().getSimpleName());		
		this.company = company;
		this.price = price;
		this.color = color;
		this.cc = cc;
		this.sportsBikeDTO = sportsBikeDTO;
		
	}


	@Override
	public String toString() {
		return "ScooterDTO [company=" + company + ", price=" + price + ", color=" + color + ", cc=" + cc
				+ ", sportsBikeDTO=" + sportsBikeDTO + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScooterDTO other = (ScooterDTO) obj;
		if (cc != other.cc)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public SportsBikeDTO getSportsBikeDTO() {
		return sportsBikeDTO;
	}

	public void setSportsBikeDTO(SportsBikeDTO sportsBikeDTO) {
		this.sportsBikeDTO = sportsBikeDTO;
	}

}
