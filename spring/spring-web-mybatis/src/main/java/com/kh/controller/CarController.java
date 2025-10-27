package com.kh.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		// 기존 request.setAttribute("carList",list);
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

	@GetMapping("/car/{id}")
	public ModelAndView updateView(ModelAndView view,@PathVariable String id) {
		System.out.println("수정할 자동차 아이디 : " + id);
		//id에 해당하는 자동차 정보 1건을 조회
		CarDTO car = service.selectCarForId(id);
		System.out.println(car);
		view.addObject("car", car);		
		view.setViewName("car_update_view");
		return view;
	}
	
	@PostMapping("/car/update")
	public String update(CarDTO car) {
		System.out.println("수정할 차량정보");
		System.out.println(car);
		int count = service.updateCar(car);
		System.out.println("수정 : " + count);
		return "redirect:/";
	}
	
	@GetMapping("/car/insert/view")
	public String insertView() {
		return "car_insert_view";
	}
	
	@PostMapping("/car/insert")
	public String insert(CarDTO car) {
		//받아온 자동차 정보를 확인
		
		//서비스로 보내서 데이터베이스에 저장까지 되게끔 처리
		
		
		return "redirect:/";
	}
}









