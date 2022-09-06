package com.xworkz.bikeshowroom;

import com.xworkz.bikeshowroom.dao.BikeDAO;
import com.xworkz.bikeshowroom.dao.BikeDAOImpl;
import com.xworkz.bikeshowroom.dto.BikeDTO;
import com.xworkz.bikeshowroom.dto.ScooterDTO;
import com.xworkz.bikeshowroom.dto.SportsBikeDTO;
import com.xworkz.bikeshowroom.service.BikeService;
import com.xworkz.bikeshowroom.service.BikeServiceImpl;

public class BikeRunner {

	public static void main(String args[]) {

		SportsBikeDTO sportsBikeDTO = new SportsBikeDTO("Kawasaki Ninja 300", "296 cc", 1000000, "70kmpl", "179kg");

		ScooterDTO scooterDTO = new ScooterDTO("Vespa", 150000, "Sky", 150,sportsBikeDTO);

		BikeDTO bikeDTO1 = new BikeDTO("TVS Showroom", "Mys", 9137531486l, 8541308410l,scooterDTO);

		BikeDTO bikeDTO2 = new BikeDTO("Honda Showroom", "Mandya", 7530102075l, 257341821l,scooterDTO);

		BikeDTO bikeDTO3 = new BikeDTO("Adam's Showrrom", "Bangalore", 8530004128l, 423000782l,scooterDTO);

		BikeDTO bikeDTO4 = new BikeDTO("Yamaha Showroom", "Maddur", 8000425591l, 3000741965l,scooterDTO);

		BikeDTO bikeDTO5 = new BikeDTO("Royal Showroom", "Ramnagar", 9000431860l, 5721863041l,scooterDTO);

		BikeDAO dao = new BikeDAOImpl();

		BikeService service = new BikeServiceImpl(dao);

		boolean value1 = service.validateAndSave(bikeDTO1);
		System.out.println(value1);

		boolean value2 = service.validateAndSave(bikeDTO2);
	System.out.println(value2);

	boolean value3 = service.validateAndSave(bikeDTO3);
	System.out.println(value3);

	boolean value4 = service.validateAndSave(bikeDTO4);
	System.out.println(value4);

	boolean value5 = service.validateAndSave(bikeDTO5);
	System.out.println(value5);

		dao.save(bikeDTO1);
	dao.save(bikeDTO2);
		dao.save(bikeDTO3);
	dao.save(bikeDTO4);
	dao.save(bikeDTO5);

	}

}
