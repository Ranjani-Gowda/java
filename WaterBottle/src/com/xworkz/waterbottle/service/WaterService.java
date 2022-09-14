package com.xworkz.waterbottle.service;

import java.util.List;
import com.xworkz.waterbottle.dto.WaterDTO;
import com.xworkz.waterbottle.exception.InvalidEx;

public interface WaterService {

	public boolean validate(WaterDTO dto) throws InvalidEx;

	public boolean save(WaterDTO dto) throws InvalidEx;

	public boolean update(int cost, WaterDTO dto) throws InvalidEx;

	public List<WaterDTO> findAllWater();

	public List<WaterDTO> sortByCost();

	public List<WaterDTO> sortByShape();

	public boolean deleteByCompany(String company);

}
