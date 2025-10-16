package e07_list;

import java.util.ArrayList;

public class ListMain {
	
	//ArrayList, LinkedList, Vector
	public static void main(String[] args) {
		ArrayList<Person> arrayList = new ArrayList<Person>();
		
		//데이터 추가
		arrayList.add(new Person("김철수", 22));
		arrayList.add(new Person("박영수", 21));
		arrayList.add(new Person("문규수", 32));
		arrayList.add(new Person("이철수", 33));
		arrayList.add(new Person("헝철수", 35));
		arrayList.add(new Person("강명수", 44));
		
		System.out.println(arrayList);
		
		//데이터 삭제
		arrayList.remove(5);
		System.out.println(arrayList);
		arrayList.remove(new Person("문규수", 32));
		System.out.println(arrayList);
		
		//데이터가 저장된 개수
		System.out.println("저장된 값의 개수 : "+arrayList.size());
		
		//데이터 교체
		
		//특정 데이터가 있는지 확인?
		
		//특정 데이터가 있는 위치
		
		//전체 초기화
		
		//데이터 전체 조회 방법 - 1
		
		//데이터 전체 조회 방법 - 2
		
		//데이터 전체 조회 방법 - 3
	}

}







