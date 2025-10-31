package com.kh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.dto.MemberDTO;
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
		List<MemberDTO> list = service.selectAllMember();		
		
		if(list.isEmpty()) {
			map.put("msg", "회원정보 조회 작업에 실패 했습니다.");
		}else {
			map.put("list", list);
			map.put("msg", "회원정보 조회 작업을 성공했습니다.");
			map.put("count", list.size());
			
		}
		
		return map; 
	}
	

}








