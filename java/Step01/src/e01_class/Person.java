package e01_class;

public class Person {
	//클래스 안에 선언된 변수는 해당 객체가 일을 할 때 사용되는 변수
	//이런 변수들을 필드(field) 라고 함.
	
	//접근제어자
	//	private default protected public
	
	//필드
	//이름
	private String name;
	//나이
	private int age;
	
	//생성자(Constructor)
	//	기본 생성자
	public Person() {
		//다른 생성자도 호출 가능
		this("김철수",20);
	}
	public Person(String name, int age) {
		this.name = name;
		this.printInfo();
	}
	
	//메서드
	// 객체가 할일(우리가 시킬일)
	public void printInfo() {
		System.out.println(name + " / " + age);
	}
}
