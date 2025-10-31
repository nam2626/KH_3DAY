package com.kh.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kh.service.MemberService;

@RestController
public class MainController {
	
	private MemberService service;

	public MainController(MemberService service) {
		this.service = service;
	}
	
	

}
