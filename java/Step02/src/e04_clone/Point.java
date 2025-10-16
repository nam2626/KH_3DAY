package e04_clone;

import java.util.Objects;

//x , y 좌표값을 저장
//필드 초기화하는 생성자, toString, hashCode, equals, set/get
public class Point implements Cloneable{
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
