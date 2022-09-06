package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

public class SportsBikeDTO implements Serializable {

	private String company;
	private String cc;
	private double price;
	private String mileage;
	private String weight;

	public SportsBikeDTO() {

	}

	public SportsBikeDTO(String company, String cc, double price, String mileage, String weight) {
		System.out.println("Generated - " + this.getClass().getSimpleName());
		this.company = company;
		this.cc = cc;
		this.price = price;
		this.mileage = mileage;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "SportsBikeDTO [company=" + company + ", cc=" + cc + ", price=" + price + ", mileage=" + mileage
				+ ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportsBikeDTO other = (SportsBikeDTO) obj;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (mileage == null) {
			if (other.mileage != null)
				return false;
		} else if (!mileage.equals(other.mileage))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
