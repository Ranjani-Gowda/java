package com.xworkz.waterbottle.dto;

import java.io.Serializable;

import com.xworkz.waterbottle.constants.Liter;

public class WaterDTO implements Comparable<WaterDTO>,Serializable {
	
	private String company;
	private double cost;
	private Liter liter;
	private String shape;
	
	public WaterDTO(String company, double cost, Liter liter, String shape) {
		super();
		this.company = company;
		this.cost = cost;
		this.liter = liter;
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "WaterDTO [company=" + company + ", cost=" + cost + ", liter=" + liter + ", shape=" + shape + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Liter getLiter() {
		return liter;
	}

	public void setLiter(Liter liter) {
		this.liter = liter;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaterDTO other = (WaterDTO) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (liter != other.liter)
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		return true;
	}

		@Override
		public int compareTo(WaterDTO o) {
			return this.company.compareTo(o.getCompany());
		}
	
	

}
