package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> map = new HashMap<>();

		System.out.print("이름 : ");
		String name = scan.next();
		map.put("name", name);

		System.out.print("점수 : ");
		int score = scan.nextInt();
		map.put("score", score);

		list.add(map);
		System.out.println(list);
		System.out.println(list.get(0).get("score"));
		System.out.println(list.get(0));

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(3);
		intList.add(5);
		intList.add(4);
		intList.add(2);

		System.out.println(intList);

		intList.add(1, 10);
		int sum = 0;
		while (true) {
			System.out.print("숫자를 입력하세요(-1을 입력하면 종료됩니다.) : ");
			int input = scan.nextInt();
			if (input == -1) {
				break;
			}
			intList.add(input);
			sum += input;
		}
		System.out.println("리스트의 합 : " + sum);
		System.out.println(intList);
		scan.close();
	}
}