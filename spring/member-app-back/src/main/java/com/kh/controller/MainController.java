package com.kh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//회원정보 추가
	@PostMapping("/member/insert")
	public Map<String, Object> insertMember(@RequestBody MemberDTO member){
		Map<String, Object> map = new HashMap<String, Object>();
		//회원정보 등록 성공 여부를 클라이언트에게 전달
		int count = service.insertMember(member);
		
		map.put("result", count);
		map.put("msg", count == 0 ? "데이터 등록 실패" : "데이터 등록 성공");
		System.out.println(member);
		return map;
	}
	
	@PatchMapping("/member/update")
	public Map<String, Object> updateMember(@RequestBody MemberDTO member){
		Map<String, Object> map = new HashMap<String, Object>();
		//회원정보 수정 성공 여부를 클라이언트에게 전달
		int count = service.updateMember(member);
		
		map.put("result", count);
		map.put("msg", count == 0 ? "데이터 수정 실패" : "데이터 수정 성공");
		System.out.println(member);
		return map;
	}
	
	@DeleteMapping("/member/delete/{id}")
	public Map<String, Object> deleteMember(@PathVariable String id){
		Map<String, Object> map = new HashMap<String, Object>();
		//회원정보 삭제 성공 여부를 클라이언트에게 전달
		int count = service.deleteMember(id);
		
		map.put("result", count);
		map.put("msg", count == 0 ? "데이터 삭제 실패" : "데이터 삭제 성공");
		return map;
	}
	
	
}








