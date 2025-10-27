package com.kh.service;

import org.springframework.stereotype.Service;

import com.kh.mapper.CarMapper;

@Service
public class CarService {
	private final CarMapper mapper;

	public CarService(CarMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
