package com.xworkz.bikeshowroom.service;

import com.xworkz.bikeshowroom.dto.BikeDTO;

public interface BikeService {

	public abstract boolean validateAndSave(BikeDTO bikeDTO);
}
