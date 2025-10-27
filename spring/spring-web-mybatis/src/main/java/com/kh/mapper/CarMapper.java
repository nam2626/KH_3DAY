package com.kh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.dto.CarDTO;

@Mapper
public interface CarMapper {
	List<CarDTO> selectAllCar();
	int deleteCar(String id);
}
