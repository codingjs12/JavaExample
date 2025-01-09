package day09;

public class PositivePoint extends Point {

	public PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}

	}

	public PositivePoint() {
		super();
	}

	@Override
	public String toString() {
		return "(" + getX() + " , " + getY() + ") 의 점";
	}

	@Override
	protected void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

}