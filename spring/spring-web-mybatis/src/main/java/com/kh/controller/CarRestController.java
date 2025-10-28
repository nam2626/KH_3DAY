package com.kh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.dto.CarDTO;
import com.kh.service.CarService;

@RestController
public class CarRestController {
	private CarService service;

	public CarRestController(CarService service) {
		this.service = service;
	}
	
	@PostMapping("/car/search/post")
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








