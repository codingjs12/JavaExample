package day10;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;

		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}

}

class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rect p = (Rect) obj;
		if (width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}
