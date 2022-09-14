package com.xworkz.waterbottle.service;

import java.util.Comparator;
import java.util.List;

import com.xworkz.waterbottle.dao.WaterDAO;
import com.xworkz.waterbottle.dto.WaterDTO;
import com.xworkz.waterbottle.exception.InvalidEx;

public class WaterServiceImpl implements WaterService {

	private WaterDAO dao;

	public WaterServiceImpl(WaterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validate(WaterDTO dto) throws InvalidEx {
		if (dto != null) {
			if (dto.getCompany() == null || dto.getCompany().isEmpty() || dto.getCompany().length() < 3) {
				throw new InvalidEx("Company name is not valid");
			}
			if (dto.getShape() == null || dto.getShape().isEmpty() || dto.getShape().length() < 3) {
				throw new InvalidEx("Shape is not valid");
			}
			if (dto.getCost() < 0 || dto.getCost() > 150) {
				throw new InvalidEx("Cost is not valid");
			}
			System.out.println("dto is validated");
			return true;

		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean save(WaterDTO dto) throws InvalidEx {
		if (dto != null) {

			if (validate(dto)) {
				if (dao.save(dto)) {
					System.out.println(dto.toString());
					return true;
				}
			}
		}
		System.out.println("cannot save");
		return false;
	}

	@Override
	public boolean update(int cost, WaterDTO dto) throws InvalidEx {
		if (dto != null) {

			if (validate(dto)) {
				if (dao.updateByCost(cost, dto)) {
					System.out.println(dto.toString());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<WaterDTO> findAllWater() {
		dao.findAllWater();
		return null;
	}

	@Override
	public List<WaterDTO> sortByCost() {
		dao.sortByCost();
		return null;
	}

	@Override
	public List<WaterDTO> sortByShape() {
		dao.sortByShape();
		return null;
	}

	@Override
	public boolean deleteByCompany(String company) {
		dao.deleteByCompany(company);
		return false;
		}

}