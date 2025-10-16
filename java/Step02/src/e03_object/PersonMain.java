package e03_object;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		Person s = new Person("홍길동", 20);
		
		System.out.println(p.hashCode());
		System.out.println(s.hashCode());
		
		System.out.println(p.equals(s));
		System.out.println(p.equals(null));
		//내용은 같지만 메모리 주소가 달라서 false가 나온다
		System.out.println(p);
		System.out.println(s);
		System.out.println(p == s);
	}

}




