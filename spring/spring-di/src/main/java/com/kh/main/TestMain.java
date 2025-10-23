package com.kh.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.context.AppContext;
import com.kh.vo.Greeting;
import com.kh.vo.Person;

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
		
		System.out.println(g1 == g2);
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		
		Person p1 = ctx.getBean("person",Person.class);
		System.out.println(p1);
		Person p2 = ctx.getBean("person",Person.class);
		p2.setName("박영일");
		p2.setAge(55);
		System.out.println(p2);
		System.out.println(p1);
		
	}

}






