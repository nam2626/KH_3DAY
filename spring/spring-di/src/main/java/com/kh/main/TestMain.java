package com.kh.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.context.AppContext;
import com.kh.vo.Greeting;

public class TestMain {

	public static void main(String[] args) {
		//AppContext.class를 이용해서 스프링 컨테이너 초기화
		AnnotationConfigApplicationContext ctx 
		= new AnnotationConfigApplicationContext(AppContext.class);
		
		//Greeting 객체를 가져오기
		Greeting g1 = (Greeting) ctx.getBean("greeter");
		System.out.println(g1);
		Greeting g2 = ctx.getBean("greeter",Greeting.class);
		System.out.println(g2);
		
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		
	}

}






