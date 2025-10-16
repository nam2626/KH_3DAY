package e04_clone;

//필드 초기화 생성자, set/get, toString, clone
public class Circle implements Cloneable {
	private Point pos;
	private int r;

	public Circle(Point pos, int r) {
		super();
		this.pos = pos;
		this.r = r;
	}

	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [pos=" + pos + ", r=" + r + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//깊은 복사, 얕은 복사 체크
		//참조형의 경우 깊은 복사를 수행
		//깊은 복사는 참조형의 경우 메모리 주소값이 복제가됨
		//참조형 데이터는 새로 복제를 해서 저장
		return new Circle((Point) pos.clone(), r);
//		return super.clone();
	}
	
}
