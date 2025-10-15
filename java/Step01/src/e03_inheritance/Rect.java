package e03_inheritance;

public class Rect extends Shape{
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		System.out.println("Rect : area()");
		return width * height;
	}
	
}
