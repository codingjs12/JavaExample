package day8;

public class PointMain {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		ColorPoint cp = new ColorPoint();
		
		p.set(1, 2);
		p.showPoint();
		
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
