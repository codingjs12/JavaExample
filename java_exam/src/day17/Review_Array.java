package day17;

import day05.Human;

public class Review_Array {

	public static void main(String[] args) {

		String arr[] = { "햄버거", "김치찌개", "피자", "타코" };

		Human arr2[] = new Human[3];

		arr2[0] = new Human();

		Human hong = new Human();
		hong.name = "홍길동";

		Human kim = new Human();
		kim.name = "김철수";

		arr2[1] = hong;

		arr2[2] = kim;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].name);
		}
	}
}