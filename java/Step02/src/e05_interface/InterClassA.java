package e05_interface;

public class InterClassA implements InterA, InterB{

	@Override
	public void interB() {
		System.out.println("InterAClass interB");
	}
	//동일한 추상메서드가 여러개 있어도 한번만 재정의 하면됨
	@Override
	public void interA() {
		System.out.println("InterAClass interA");
	}

}
