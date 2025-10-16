package e02_has_a;

public class Army {
	private Gun gun;

	public Army(Gun gun) {
		this.gun = gun;
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}

}



