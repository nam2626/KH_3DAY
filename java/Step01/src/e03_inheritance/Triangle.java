package e03_inheritance;

public class Triangle extends Shape{
	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		System.out.println("Triangle : area()");
		return base * height / 2.0;
	}
	
}