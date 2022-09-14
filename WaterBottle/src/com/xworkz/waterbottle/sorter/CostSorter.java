package com.xworkz.waterbottle.sorter;

import java.util.Comparator;

import com.xworkz.waterbottle.dto.WaterDTO;

public class CostSorter implements Comparator<WaterDTO> {

	@Override
	public int compare(WaterDTO o1, WaterDTO o2) {
		if (o1.getCost() > o2.getCost())
			return 25;
		if (o1.getCost() < o2.getCost())
			return -86;
		return 0;
	}

}
