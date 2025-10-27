package com.kh.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.kh.SpringWebMybatisApplication;
import com.kh.dto.CarDTO;
import com.kh.service.CarService;

//@RequestMapping("/car")
@Controller
public class CarController {


	private CarService service;

	public CarController(CarService service) {
		this.service = service;
	}

	@GetMapping("/")
	public ModelAndView main(ModelAndView view) {
//		ModelAndView view = new ModelAndView();
		List<CarDTO> list = service.selectAllCar();
		System.out.println(list);
		//기존 request.setAttribute("carList",list);
		view.addObject("carList", list);
		view.setViewName("main");
		return view;
	}
	
	@GetMapping("/car/delete")
	public String delete(String id) {
		System.out.println("삭제할 아이디 : " + id);
		int count = service.deleteCar(id);
		
		System.out.println("삭제 : " + count);
		return "redirect:/";
	}
	
}












