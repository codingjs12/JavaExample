package day10;

import java.util.Scanner;

public class PointMain {

	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);

		System.out.println(p1 == p2);

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		Rect x = new Rect(2, 3);
		Rect y = new Rect(3, 2);

		if (a == b) {
			System.out.println("a == b");
		}

		if (a.equals(b)) {
			System.out.println("a is equal to b");
		}

		if (a.equals(c)) {
			System.out.println("a is equal to c");
		}

		if (x.equals(y)) {
			System.out.println("x is equal to y");
		}

		Scanner scan = new Scanner(System.in);
		String name = "hong";
		System.out.println("이름 : " + name);
		System.out.print("이름 : ");

		String name2 = scan.next();
		System.out.println(name.equals(name2));

		scan.close();

	}

}
