package com.kh.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.kh.dto.CarDTO;

@Mapper
public interface CarMapper {
	List<CarDTO> selectAllCar();
	int deleteCar(String id);
	CarDTO selectCarForId(String id);
	int updateCar(CarDTO car);
	int insertCar(CarDTO car);
	List<CarDTO> searchCar(Map<String, Object> map);
}
