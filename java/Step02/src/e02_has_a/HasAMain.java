package e02_has_a;

public class HasAMain {

	public static void main(String[] args) {
		Army army = new Army(new Gun());
		for (int i = 0; i < 20; i++) {
			army.shot();
		}
		// 총기를 교체하고 쏘는 부분
	}

}
