package com.kh.vo;

public class Greeting {
	private long id;
	private String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
		System.out.println("Greeting 생성자 실행");
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	
}
