package day9.sub;

class Circle {
	int radius;

	Circle(int r) {
		radius = r;
	}
}

public class Test {

	public static int increase(int n) {
		return n++;
	}

	public static void increase(Circle c) {
		c.radius++;
	}

	public static void main(String[] args) {

		int n = 30;

		n = increase(n);

		System.out.println(n);

		Circle c = new Circle(50);
		increase(c);
		System.out.println(c.radius);

		Circle c2 = new Circle(20);
		c.radius = 30;

		System.out.println(c2.radius);

		Circle c3 = c2;

		c3.radius = 100;

		System.out.println(c2.radius);

	}
}
