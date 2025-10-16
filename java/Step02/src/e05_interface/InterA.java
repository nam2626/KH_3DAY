package e05_interface;

public interface InterA {
//	double PI = 3.1415;
	//public static final 자동으로 붙음
	public static final double PI = 3.1415;
	
//	void interA();
	//public abstract 안써도 자동으로 붙음
	public abstract void interA();
	
	//디폴트 메서드 --> jdk8버전부터 지원
	default double circleArea(double r) {
		return r * r * PI; 
	}
	
}




