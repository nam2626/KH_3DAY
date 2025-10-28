package com.kh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
		System.out.println("등록할 자동차 정보 : " + car);
		//서비스로 보내서 데이터베이스에 저장까지 되게끔 처리
		int count = service.insertCar(car);
		System.out.println("데이터 추가 결과 : " + count);
		
		return "redirect:/";
	}
	
	@ResponseBody
	@GetMapping("/car/search")
	public Map<String, Object> searchCar(String kind, String search) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			List<CarDTO> list = service.searchCar(kind,search);
			if(list.size() == 0)
				throw new Exception("검색 결과 없음, 검색어 확인해 주세요");
			map.put("list", list);
			map.put("count", list.size());
			map.put("msg", "데이터 검색 성공");
		
		}catch (Exception e) {
			//Exception 발생 했을때 메세지 설정
			map.put("msg", e.getMessage());
		}finally {
			//전달할 항목 중 반드시 들어가야하는 내용 추가하는 영역
			map.put("request",kind + " / " + search);
		}
		return map;
	}
}









