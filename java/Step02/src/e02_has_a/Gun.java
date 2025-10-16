package e02_has_a;

import java.util.Date;

/*
 * 	총 클래스
 * 		필드 
 * 			총알 - 12발
 * 		메서드
 * 			총쏘는 메서드 -> 1발씩 발사, 총알이 없으면 자동으로 재장전 실행
 * 			재장전
 * 
 */
public class Gun {
	private int bullet;

	public Gun() {
		bullet = 12;
	}
	
	public void shot() {
		if(bullet > 0) {
			bullet--;
			System.out.println("BBang! - 잔탄 : " + bullet);
		}else {
			reload();
		}
	}

	public void reload() {
		bullet = 12;
		System.out.println("reload!!");
	}
}
