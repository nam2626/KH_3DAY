package e04_clone;

public class CloneMain {

	public static void main(String[] args)
			throws CloneNotSupportedException {
		Point p1 = new Point(10, 7);
		Point p2 = (Point) p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setX(100);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
	}

}




