package com.xworkz.waterbottle.dao;

import java.util.List;

import com.xworkz.waterbottle.dto.WaterDTO;

public interface WaterDAO {

	public boolean save(WaterDTO dto);

	public boolean findDuplicate(WaterDTO dto);

	public boolean updateByCost(int cost, WaterDTO dto);

	public List<WaterDTO> findAllWater();

	public List<WaterDTO> sortByCost();

	public List<WaterDTO> sortByShape();

	public boolean deleteByCompany(String company);


}
