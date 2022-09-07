package com.xworkz.bikeshowroom;

import com.xworkz.bikeshowroom.dao.BikeDAO;
import com.xworkz.bikeshowroom.dao.BikeDAOImpl;
import com.xworkz.bikeshowroom.dto.BikeDTO;
import com.xworkz.bikeshowroom.dto.ScooterDTO;
import com.xworkz.bikeshowroom.dto.SportsBikeDTO;
import com.xworkz.bikeshowroom.service.BikeService;
import com.xworkz.bikeshowroom.service.BikeServiceImpl;
import com.xworkz.bikeshowroom.exception.*;

public class BikeRunner {

	public static void main(String args[]) throws InvalidDataExp {

		SportsBikeDTO sportsBikeDTO1 = new SportsBikeDTO("Ninja", "200cc", 800000, "32Kmphl", "178kg");
		ScooterDTO scooterDTO1 = new ScooterDTO("Honda", 500000, "Grey", 150, sportsBikeDTO1);
		BikeDTO bikeDTO1 = new BikeDTO("TVS Showroom", "Mysore", 9137531486l, 8541308410l, scooterDTO1);

		SportsBikeDTO sportsBikeDTO2 = new SportsBikeDTO("Gixer", "150cc", 600000, "30Kmphl", "165kg");
		ScooterDTO scooterDTO2 = new ScooterDTO("Jupiter", 300000, "Black", 130, sportsBikeDTO2);
		BikeDTO bikeDTO2 = new BikeDTO("Honda Showroom", "Mandya", 7530102075l, 257341821l, scooterDTO2);

		SportsBikeDTO sportsBikeDTO3 = new SportsBikeDTO("Pulsar", "220cc", 500000, "31Kmphl", "175kg");
		ScooterDTO scooterDTO3 = new ScooterDTO("Scooty", 400000, "Blue", 160, sportsBikeDTO3);
		BikeDTO bikeDTO3 = new BikeDTO("Adam's Showrrom", "Bangalore", 8530004128l, 423000782l, scooterDTO3);

		SportsBikeDTO sportsBikeDTO4 = new SportsBikeDTO("KTM", "250cc", 700000, "33Kmphl", "180kg");
		ScooterDTO scooterDTO4 = new ScooterDTO("Vespa", 650000, "White", 120, sportsBikeDTO4);
		BikeDTO bikeDTO4 = new BikeDTO("Yamaha Showroom", "Maddur", 8000425591l, 3000741965l, scooterDTO4);

		SportsBikeDTO sportsBikeDTO5 = new SportsBikeDTO("R15", "240cc", 750000, "34Kmphl", "185kg");
		ScooterDTO scooterDTO5 = new ScooterDTO("Activa", 550000, "Red", 125, sportsBikeDTO5);
		BikeDTO bikeDTO5 = new BikeDTO("Royal Showroom", "Ramnagar", 9000431860l, 5721863041l, scooterDTO5);

		SportsBikeDTO sportsBikeDTO6 = new SportsBikeDTO("Ducati", "210cc", 650000, "29Kmphl", "182kg");
		ScooterDTO scooterDTO6 = new ScooterDTO("Bajaj", 450000, "Green", 122, sportsBikeDTO6);
		BikeDTO bikeDTO6 = new BikeDTO("SR Showroom", "Bidadi", 8423945184l, 7384102318l, scooterDTO6);

		BikeDAO dao = new BikeDAOImpl();

		BikeService service = new BikeServiceImpl(dao);

		try {
			service.validateAndSave(bikeDTO1);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {

		}
		try {
			service.validateAndSave(bikeDTO2);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {
		}

		try {
			service.validateAndSave(bikeDTO3);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {
		}
		try {
			service.validateAndSave(bikeDTO4);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {
		}

		try {
			service.validateAndSave(bikeDTO5);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {
		}

		try {
			service.validateAndSave(bikeDTO6);
		} catch (ArrayFullExp e) {

		} catch (InvalidDataExp e) {
		}

		try {
			service.validateAndupdateByName("TVS Showroom", bikeDTO6);
		} catch (InvalidDataExp e) {

		}

		service.display();

		service.findByCc(125);
		service.findByColor("Black");
		service.findByColorandCompany("Red", "Activa");
		service.findByLocation("Mysore");
		service.findByMileageandWeight("33Kmphl", "180kg");
		service.deleteByCompany("Vespa");

	}

}
