package com.xworkz.waterbottle.sorter;

import java.util.Comparator;

import com.xworkz.waterbottle.dto.WaterDTO;

public class ShapeSorter implements Comparator<WaterDTO> {

	@Override
	public int compare(WaterDTO o1, WaterDTO o2) {
		return (o1.getShape().compareTo(o2.getShape()));
	}

	
}
