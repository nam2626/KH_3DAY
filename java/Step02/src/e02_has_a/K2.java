package e02_has_a;

public class K2 extends Gun{
	
	@Override
	public void shot() {
		if(bullet > 3) {
			bullet -= 3;
			System.out.println("BBang! BBang! - 잔탄 : " + bullet);
		}else {
			reload();
		}
	}
	
}
