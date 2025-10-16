package e03_object;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * 객체가 가지고 있는 필드나 메서드의 결과를
	 * 외부에서 쉽게 확인이 가능하게
	 * 필드와 메서드의 결과를 하나의 문자열로 만들어서 리턴하는 메서드
	 * 
	 * 재정의하지 않으면 타입명@객체의해시코드(16진수)
	*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
//		return name.hashCode() + age;
		return Objects.hash(name,age);
	}
	
}






