package com.kh.controller;

import org.springframework.stereotype.Controller;

import com.kh.service.CarService;

@Controller
public class CarController {

	private CarService service;

	public CarController(CarService service) {
		this.service = service;
	}
	
	
	
}
