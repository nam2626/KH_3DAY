package e07_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain {
	
	//ArrayList, LinkedList, Vector
	//데이터를 추가한 순서대로 저장, 중복된 데이터를 저장할 수 있음
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		//데이터 추가
		list.add(new Person("김철수", 22));
		list.add(new Person("박영수", 21));
		list.add(new Person("문규수", 32));
		list.add(new Person("이철수", 33));
		list.add(new Person("헝철수", 35));
		list.add(new Person("강명수", 44));
		
		System.out.println(list);
		
		//데이터 삭제
		list.remove(5);
		System.out.println(list);
		list.remove(new Person("문규수", 32));
		System.out.println(list);
		
		//데이터가 저장된 개수
		System.out.println("저장된 값의 개수 : "+list.size());
		
		//데이터 교체
		list.set(0,new Person("오수호", 44));
		System.out.println(list);
		list.add(0, new Person("임강호", 33));
		System.out.println(list);
		
		//특정 데이터가 있는지 확인?
		System.out.println(list.contains(new Person("헝철수", 35)));
		//특정 데이터가 있는 위치
		System.out.println(list.indexOf(new Person("헝철수", 35)));
		
		//전체 초기화
		//list.clear();
		System.out.println(list);
		
		//데이터 전체 조회 방법 - 1
		for (int i = 0; i < list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("------------");
		//데이터 전체 조회 방법 - 2
		list.stream().forEach(item -> System.out.println(item));
		
		//데이터 전체 조회 방법 - 3
	}

}







