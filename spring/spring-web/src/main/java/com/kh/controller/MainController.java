package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.SpringWebApplication;
import com.kh.service.PersonService;
import com.kh.vo.PersonVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
   
	private final PersonService service;
	
	public MainController(PersonService service) {
		this.service = service;
	}

	@GetMapping("/")
	public String main() {
		service.serviceTest();
		return "index";
	}

	@GetMapping("/member/login/view")
	public String loginView() {
		return "login";
	}

	/*
	 * @PostMapping("/member/login") public String login(HttpServletRequest
	 * request,HttpSession session) { String userName =
	 * request.getParameter("username"); String password =
	 * request.getParameter("password");
	 * 
	 * System.out.println(userName + " / " + password); request.setAttribute("msg",
	 * "안녕하세요 : " + userName); // HttpSession session = request.getSession();
	 * session.setAttribute("pwd", "암호 : "+password);
	 * 
	 * return "main"; }
	 */ 

	@PostMapping("/member/login")
//	public String login(HttpSession session, HttpServletRequest request,
//			@RequestParam(name = "username") String username,
//			@RequestParam(name = "password") String password) {
	public String login(HttpSession session, 
			HttpServletRequest request, 
			String username, String password) {

		session.setAttribute("pwd", "pwd - " + password);
		request.setAttribute("msg", "msg - " + username);

		PersonVO p1 = new PersonVO("홍길동", 20);
		System.out.println(p1);
		
		return "main";
	}
	
	//뷰 이동 처리
	@GetMapping("/person/insert")
	public String personInsertView() {
		return "person_insert";
	}
	
	@PostMapping("/person/insert")
	public String personInsert(PersonVO p) {
//		System.out.println(name + " / " + age);
		System.out.println(p);
		return "main";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//세션 정보를 전부 무력화
		session.invalidate();
		return "main";
	}
}













