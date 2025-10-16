package e04_clone;

public class CircleMain {

	public static void main(String[] args) 
			throws CloneNotSupportedException {
		Circle c1 = new Circle(new Point(10, 5), 7);
		Circle c2 = (Circle) c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));

		c1.setR(10);
		System.out.println(c1);
		System.out.println(c2);
		
		c1.getPos().setX(200);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(System.identityHashCode(c1.getPos()));
		System.out.println(System.identityHashCode(c2.getPos()));
		
	}

}


