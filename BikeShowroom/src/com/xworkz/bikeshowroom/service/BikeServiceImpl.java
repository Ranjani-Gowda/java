package com.xworkz.bikeshowroom.service;

import com.xworkz.bikeshowroom.dao.BikeDAO;
import com.xworkz.bikeshowroom.dto.BikeDTO;
import com.xworkz.bikeshowroom.exception.InvalidDataExp;

public class BikeServiceImpl implements BikeService {

	private BikeDAO dao;

	public BikeServiceImpl(BikeDAO dao) {
		System.out.println("Generated - " + this.getClass().getSimpleName());
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(BikeDTO bikeDTO) throws InvalidDataExp {

		if (bikeDTO != null) {

			if (bikeDTO.getName() == null || bikeDTO.getName().isEmpty() || bikeDTO.getName().length() < 3) {
				throw new InvalidDataExp("Name is not valid Data");
			}

			if (bikeDTO.getLocation() == null || bikeDTO.getLocation().isEmpty()
					|| bikeDTO.getLocation().length() < 5) {
				throw new InvalidDataExp("Location is not valid");

			}

			if (bikeDTO.getGstNo() < 0) {
				throw new InvalidDataExp("GST No is not valid");

			}

			if (bikeDTO.getPhno() < 0) {
				throw new InvalidDataExp("Phone No is not valid");

			}

			if (bikeDTO.getScooterDTO() == null) {
				throw new InvalidDataExp("Scooter is not valid");

			}

			if (bikeDTO.getScooterDTO().getColor() == null || bikeDTO.getScooterDTO().getColor().isEmpty()) {
				throw new InvalidDataExp("Scooter color No is not valid");

			}

			if (bikeDTO.getScooterDTO().getCc() == 0 || bikeDTO.getScooterDTO().getCc() > 5000) {
				throw new InvalidDataExp("Scooter CC is not valid");

			}

			if (bikeDTO.getScooterDTO().getPrice() == 0 || bikeDTO.getScooterDTO().getPrice() > 800000) {
				throw new InvalidDataExp("Scooter price No is not valid");
			}

			if (bikeDTO.getScooterDTO().getCompany() == null || bikeDTO.getScooterDTO().getCompany().isEmpty()) {
				throw new InvalidDataExp("Scooter company is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage().isEmpty()) {
				throw new InvalidDataExp("Mileage is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getCc() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getCc().isEmpty()) {
				throw new InvalidDataExp("CC is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getPrice() == 0
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getPrice() > 1000000) {
				throw new InvalidDataExp("GST No is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getWeight() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getWeight().isEmpty()) {
				throw new InvalidDataExp("Weight is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getCompany() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getCompany().isEmpty()) {
				throw new InvalidDataExp("SB Company is not valid");

			}
			boolean isDuplicate = findDuplicate(bikeDTO);
			if (!isDuplicate) {
				boolean isSave = dao.save(bikeDTO);
				return true;
			} else {
				System.out.println("Duplicate found. cannot save");
				return false;
			}

		}
		System.out.println("Do not pass null cannot save");
		return false;
	}

	@Override
	public BikeDTO findByLocation(String location) {
		return dao.findByLocation(location);
	}

	@Override
	public BikeDTO findByCc(int cc) {
		return dao.findByCc(cc);
	}

	@Override
	public BikeDTO findByColor(String color) {
		return dao.findByColor(color);
	}

	@Override
	public BikeDTO findByColorandCompany(String color, String company) {
		return dao.findByColorandCompany(color, company);
	}

	@Override
	public BikeDTO findByMileageandWeight(String mileage, String weight) {
		return dao.findByMileageandWeight(mileage, weight);
	}

	@Override
	public BikeDTO deleteByCompany(String company) {
		return dao.deleteByCompany(company);
	}

	@Override
	public boolean findDuplicate(BikeDTO bikeDTO) {
		return dao.findDuplicate(bikeDTO);
	}

	@Override
	public boolean validateAndupdateByName(String name, BikeDTO bikeDTO) throws InvalidDataExp {
		if (bikeDTO != null) {
			boolean isDuplicate = findDuplicate(bikeDTO);
			if (!isDuplicate) {
			}
			if (bikeDTO.getName() == null || bikeDTO.getName().isEmpty() || bikeDTO.getName().length() < 3) {
				throw new InvalidDataExp("Name is not valid Data");
			}

			if (bikeDTO.getLocation() == null || bikeDTO.getLocation().isEmpty()
					|| bikeDTO.getLocation().length() < 5) {
				throw new InvalidDataExp("Location is not valid");

			}

			if (bikeDTO.getGstNo() < 0) {
				throw new InvalidDataExp("GST No is not valid");

			}

			if (bikeDTO.getPhno() < 0) {
				throw new InvalidDataExp("Phone No is not valid");

			}

			if (bikeDTO.getScooterDTO() == null) {
				throw new InvalidDataExp("Scooter is not valid");

			}

			if (bikeDTO.getScooterDTO().getColor() == null || bikeDTO.getScooterDTO().getColor().isEmpty()) {
				throw new InvalidDataExp("Scooter color No is not valid");

			}

			if (bikeDTO.getScooterDTO().getCc() == 0 || bikeDTO.getScooterDTO().getCc() > 5000) {
				throw new InvalidDataExp("Scooter CC is not valid");

			}

			if (bikeDTO.getScooterDTO().getPrice() == 0 || bikeDTO.getScooterDTO().getPrice() > 800000) {
				throw new InvalidDataExp("Scooter price No is not valid");
			}

			if (bikeDTO.getScooterDTO().getCompany() == null || bikeDTO.getScooterDTO().getCompany().isEmpty()) {
				throw new InvalidDataExp("Scooter company is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage().isEmpty()) {
				throw new InvalidDataExp("Mileage is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getCc() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getCc().isEmpty()) {
				throw new InvalidDataExp("CC is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getPrice() == 0
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getPrice() > 1000000) {
				throw new InvalidDataExp("GST No is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getWeight() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getWeight().isEmpty()) {
				throw new InvalidDataExp("Weight is not valid");

			}

			if (bikeDTO.getScooterDTO().getSportsBikeDTO().getCompany() == null
					|| bikeDTO.getScooterDTO().getSportsBikeDTO().getCompany().isEmpty()) {
				throw new InvalidDataExp("SB Company is not valid");

			}
			dao.updateByName(name, bikeDTO);
			return true;

		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public void display() {
		dao.display();
		
	}
}
