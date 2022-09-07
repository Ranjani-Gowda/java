package com.xworkz.bikeshowroom.dao;

import com.xworkz.bikeshowroom.dto.BikeDTO;
import com.xworkz.bikeshowroom.exception.ArrayFullExp;

public class BikeDAOImpl implements BikeDAO {

	private BikeDTO[] dtos = new BikeDTO[5];
	private int counter = 0;

	public BikeDAOImpl() {
		System.out.println("Generated - " + this.getClass().getSimpleName());

	}

	@Override
	public boolean save(BikeDTO bikeDTO) {

		if (bikeDTO == null) {
			System.out.println("Object is null cannot be saved");
			return false;
		}
		if (this.counter < this.dtos.length) {
			this.dtos[counter] = bikeDTO;
			System.out.println("The Bike is stored at index " + this.counter);
			System.out.println(this.dtos[this.counter].getGstNo());
			this.counter++;
			return true;
		} else {
			throw new ArrayFullExp("Array is full cannot add");
		}
	}

	@Override
	public boolean updateByName(String name, BikeDTO bikeDTO) {

		if (name == null && bikeDTO == null) {
			System.out.println("The object is null");
			return false;
		}
		for (int i = 0; i < this.dtos.length; i++) {

			if (this.dtos[i] != null && this.dtos[i].getName().equals(name)) {
				this.dtos[i] = bikeDTO;
				return true;
			}
		}
		System.out.println("Name not found");
		return false;
	}

	@Override
	public BikeDTO findByLocation(String location) {

		if (location == null) {
			System.out.println("Location is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getLocation().equals(location)) {
				System.out.println("Location is found at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("Location not found");
		return null;
	}

	@Override
	public BikeDTO findByCc(int cc) {

		if (cc == 0) {
			System.out.println("CC is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
		
			if (this.dtos[i] != null && this.dtos[i].getScooterDTO().getCc()==cc) {
				System.out.println(this.dtos[i].getScooterDTO().getCc());
				System.out.println("CC is found at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("CC not found");
		return null;
	}

	@Override
	public BikeDTO findByColor(String color) {

		if (color == null) {
			System.out.println("Location is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getScooterDTO().getColor().equals(color)) {
				System.out.println("Location is found at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("location not found");
		return null;
	}

	@Override
	public BikeDTO findByColorandCompany(String color, String company) {

		if (color == null && company == null) {
			System.out.println("Bike is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getScooterDTO().getColor().equals(color)
					&& this.dtos[i].getScooterDTO().getCompany().equals(company)) {
				System.out.println("Bike is found at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("Bike not found");
		return null;

	}

	@Override
	public BikeDTO findByMileageandWeight(String mileage, String weight) {

		if (mileage == null && weight == null) {
			System.out.println("Bike1 is null cannot run method");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getScooterDTO().getSportsBikeDTO().getMileage().equals(mileage)
					&& this.dtos[i].getScooterDTO().getSportsBikeDTO().getWeight().equals(weight)) {
				System.out.println("Bike1 is found at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("Bike1 not found");
		return null;

	}

	@Override
	public BikeDTO deleteByCompany(String company) {

		if (company == null) {
			System.out.println("Company is null");
			return null;
		}
		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getScooterDTO().getCompany().equals(company)) {
				this.dtos[i] = null;
				System.out.println("DTO is deleted at index " + i);
				return this.dtos[i];
			}
		}
		System.out.println("Not found");
		return null;
	}

	@Override
	public boolean findDuplicate(BikeDTO bikeDTO) {
		if (bikeDTO != null) {
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null && this.dtos[i].equals(bikeDTO)) {
					return true;
				}
			}
		}
		return false;

	}

	@Override
	public void display() {
		for(int i=0;i<this.dtos.length;i++)
		{
			if(this.dtos[i]!=null)
			{System.out.println("-----------------------------------------------");
				System.out.println(this.dtos[i].getGstNo());
				System.out.println(this.dtos[i].getLocation());
				System.out.println(this.dtos[i].getName());
				System.out.println(this.dtos[i].getPhno());
				System.out.println(this.dtos[i].getScooterDTO().getCc());
				System.out.println(this.dtos[i].getScooterDTO().getColor());
				System.out.println(this.dtos[i].getScooterDTO().getCompany());
				System.out.println(this.dtos[i].getScooterDTO().getSportsBikeDTO().getCc());
				System.out.println(this.dtos[i].getScooterDTO().getSportsBikeDTO().getCompany());
				System.out.println(this.dtos[i].getScooterDTO().getSportsBikeDTO().getPrice());
				System.out.println(this.dtos[i].getScooterDTO().getSportsBikeDTO().getMileage());
				System.out.println(this.dtos[i].getScooterDTO().getSportsBikeDTO().getWeight());
			}
		}
		
	}

}
