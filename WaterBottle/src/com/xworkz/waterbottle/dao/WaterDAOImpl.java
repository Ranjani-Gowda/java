package com.xworkz.waterbottle.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.xworkz.waterbottle.dto.WaterDTO;
import com.xworkz.waterbottle.sorter.CostSorter;
import com.xworkz.waterbottle.sorter.ShapeSorter;

public class WaterDAOImpl implements WaterDAO {

	List<WaterDTO> list = new LinkedList<WaterDTO>();
	CostSorter costSort = new CostSorter();
	ShapeSorter shapeSorter = new ShapeSorter();

	@Override
	public boolean save(WaterDTO dto) {
		if (dto != null) {
			if (findDuplicate(dto)) {
				System.out.println("Cannot add duplicate");
				return false;
			}
			list.add(dto);
			System.out.println("Dto is added");
			return true;
		}
		System.out.println("Null cannot be added");
		return true;

	}

	@Override
	public boolean findDuplicate(WaterDTO dto) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null && list.get(i).equals(dto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateByCost(int cost, WaterDTO dto) {
		if (dto != null) {
			if (findDuplicate(dto)) {
				System.out.println("Cannot add duplicate dto");
				return false;
			}
			Iterator<WaterDTO> iterate = list.iterator();

			while (iterate.hasNext()) {
				WaterDTO waterDTO = iterate.next();
				if (waterDTO != null && waterDTO.getCost() == cost) {

					int index = list.indexOf(waterDTO);
					list.set(index, dto);

					System.out.println("Updated successfully");
					return true;
				}

			}

			System.out.println("Cant find cost ,Cannot update");
			return false;
		}

		return false;

	}

	@Override
	public List<WaterDTO> findAllWater() {
		if (!list.isEmpty()) {
			for (WaterDTO water : list) {
				System.out.println(water);
			}
		}
		return null;
	}

	@Override
	public List<WaterDTO> sortByCost() {
		if (!list.isEmpty()) {
			list.sort(costSort);
			System.out.println("Sorted By Cost");
			findAllWater();
			return list;
		}
		return null;
	}

	@Override
	public List<WaterDTO> sortByShape() {
		if (!list.isEmpty()) {
			list.sort(shapeSorter);
			System.out.println("Sorted By shape");
			findAllWater();
			return list;
		}
		return null;
	}

	@Override
	public boolean deleteByCompany(String company) {
		Iterator<WaterDTO> iterateDTO = list.iterator();
		while (iterateDTO.hasNext()) {
			WaterDTO dto = iterateDTO.next();
			if (dto != null && dto.getCompany() == company) {
				list.remove(dto);
				System.out.println("Successfully deleted dto ");
				return true;
			}
		}
		return false;
	}
}
