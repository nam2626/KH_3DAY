package com.kh.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.service.MemberService;

@RestController
public class MainController {
	
	private MemberService service;

	public MainController(MemberService service) {
		this.service = service;
	}
	
	@GetMapping("/member/list")
	public Map<String, Object> memberList(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		//전체 회원정보 읽어와서 map에 저장
				
		
		return map; 
	}
	

}








