package com.xworkz.waterbottle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.waterbottle.constants.Liter;
import com.xworkz.waterbottle.dao.WaterDAO;
import com.xworkz.waterbottle.dao.WaterDAOImpl;
import com.xworkz.waterbottle.dto.WaterDTO;
import com.xworkz.waterbottle.exception.InvalidEx;
import com.xworkz.waterbottle.service.WaterService;
import com.xworkz.waterbottle.service.WaterServiceImpl;
import com.xworkz.waterbottle.sorter.CostSorter;
import com.xworkz.waterbottle.sorter.ShapeSorter;

public class WaterRunner {

	public static void main(String[] args) {

		WaterDTO dto1 = new WaterDTO("Bisleri", 50.0, Liter.ONELITER, "Round");
		WaterDTO dto2 = new WaterDTO("Kinley", 80.0, Liter.TWOLITER, "Square");
		WaterDTO dto3 = new WaterDTO("AquaSafe", 35.0, Liter.ONELITER, "Round");
		WaterDTO dto4 = new WaterDTO("Aqua", 100.0, Liter.TWOLITER, "Square");

		WaterDAO dao = new WaterDAOImpl();

		WaterService service = new WaterServiceImpl(dao);

		try {
			System.out.println();
			service.save(dto1);

		} catch (InvalidEx e) {

		}

		try {
			System.out.println();
			service.save(dto2);
		} catch (InvalidEx e) {

		}

		try {
			System.out.println();
			service.save(dto3);
		} catch (InvalidEx e) {

		}
		try {
			System.out.println();
			service.save(dto4);
		} catch (InvalidEx e) {

		}
		service.findAllWater();

		System.out.println();
		service.findAllWater();

		System.out.println();
		service.sortByCost();

		System.out.println();
		service.sortByShape();
		System.out.println();

		service.deleteByCompany("Aqua");

		service.findAllWater();

		try {
			System.out.println();
			service.update(10, dto2);
		} catch (InvalidEx e) {
			e.printStackTrace();
		}

		System.out.println();
		service.findAllWater();
		System.out.println();

	}

}
