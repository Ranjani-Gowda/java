package com.xworkz.bikeshowroom.service;

import com.xworkz.bikeshowroom.dto.BikeDTO;
import com.xworkz.bikeshowroom.exception.InvalidDataExp;

public interface BikeService {

	public abstract boolean validateAndSave(BikeDTO bikeDTO) throws InvalidDataExp;

	public abstract boolean validateAndupdateByName(String name, BikeDTO bikeDTO) throws InvalidDataExp;

	public abstract BikeDTO findByLocation(String location);

	public abstract BikeDTO findByCc(int cc);

	public abstract BikeDTO findByColor(String color);

	public abstract BikeDTO findByColorandCompany(String color, String company);

	public abstract BikeDTO findByMileageandWeight(String mileage, String weight);

	public abstract BikeDTO deleteByCompany(String company);

	public abstract boolean findDuplicate(BikeDTO bikeDTO);
	
	public abstract void display();

}
