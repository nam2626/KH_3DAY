package com.kh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kh.dto.CarDTO;
import com.kh.mapper.CarMapper;

@Service
public class CarService {
	private final CarMapper mapper;

	public CarService(CarMapper mapper) {
		this.mapper = mapper;
	}

	public List<CarDTO> selectAllCar() {
		return mapper.selectAllCar();
	}

	public int deleteCar(String id) {
		if(id.isEmpty()) return 0;
		return mapper.deleteCar(id);
	}

	public CarDTO selectCarForId(String id) {
		return mapper.selectCarForId(id);
	}

	public int updateCar(CarDTO car) {
		return mapper.updateCar(car);
	}

	public int insertCar(CarDTO car) {
		return mapper.insertCar(car);
	}
	
	
}







