package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.SpringWebApplication;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main() {
		return "index";
	}
	
	@GetMapping("/member/login/view")
	public String loginView() {
		return "login";
	}
	
	@PostMapping("/member/login")
	public String login(HttpServletRequest request,HttpSession session) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(userName + " / " + password);
		
		request.setAttribute("msg", "안녕하세요 : " + userName);
		
//		HttpSession session = request.getSession();
		
		session.setAttribute("pwd", "암호 : "+password);
		
		return "main";
	}
}















