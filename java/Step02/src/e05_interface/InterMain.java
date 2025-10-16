package e05_interface;

public class InterMain {

	public static void main(String[] args) {
		InterClassA interClassA = new InterClassA();
		InterClassB interClassB = new InterClassB();
		
		interClassA.interA();
		interClassA.interB();
		interClassB.interA();
		//디폴트 메서드는 해당 클래스가 생성되야 사용이 가능
		interClassA.circleArea(4);
		
		InterA[] arr = new InterA[] {interClassA,interClassB};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].interA();
		}
		
		
	}

}








