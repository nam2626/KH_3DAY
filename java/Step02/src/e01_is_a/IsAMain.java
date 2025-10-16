package e01_is_a;

import java.util.Date;

public class IsAMain {
	public static void eat(Animal a) {
		a.eat();
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Human h = new Human();
		
		a.eat();
		d.eat();
		h.eat();
		
		Animal parent = d; //부모클래스 타입으로 자동 형변환
		parent.eat();//Dog eat 실행
		parent = h; //부모클래스 타입으로 자동 형변환
		parent.eat();//Human eat 실행
		
		Human h2 = (Human) parent;
		h2.eat();
//		parent = d;
		try {
			Dog d2 = (Dog) parent;
			d2.eat();
		} catch (ClassCastException e) {
			System.out.println("형변환 오류입니다.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		eat(a);
		eat(d);
		eat(h);
		System.out.println("프로그램 종료");
		
	}

}




