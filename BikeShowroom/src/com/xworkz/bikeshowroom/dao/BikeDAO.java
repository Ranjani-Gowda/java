package com.xworkz.bikeshowroom.dao;

import com.xworkz.bikeshowroom.dto.BikeDTO;

public interface BikeDAO {
	
	public abstract boolean save (BikeDTO bikeDTO);
	
	public abstract boolean updateByName (String name, BikeDTO bikeDTO);
	
	public abstract BikeDTO findByLocation (String location);
	
	public abstract BikeDTO findByCc (int cc);
	
	public abstract BikeDTO findByColor (String color);
	
	public abstract BikeDTO findByColorandCompany (String color, String company);
	
	public abstract BikeDTO findByMileageandWeight(String mileage, String weight);
	
	public abstract BikeDTO deleteByCompany (String company);
	
	public abstract boolean findDuplicate(BikeDTO bikeDTO);
	
	public abstract void display();

}
