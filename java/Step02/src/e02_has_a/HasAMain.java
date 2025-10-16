package e02_has_a;

public class HasAMain {

	public static void main(String[] args) {
		Army army = new Army();
		for (int i = 0; i < 20; i++) {
			army.shot();
		}
	}

}
