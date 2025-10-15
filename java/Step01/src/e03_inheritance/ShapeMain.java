package e03_inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c = new Circle(4);
		System.out.println(c.area());
		Rect r = new Rect(3, 5);
		System.out.println(r.area());
		Triangle t = new Triangle(3, 5);
		System.out.println(t.area());
	}

}

