package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		while (true) {
			System.out.print("문자열을 입력하세요(그만이라고 입력하면 종료합니다.) : ");
			String input = scan.next();
			if (input.equals("그만")) {
				break;
			}

			list.add(input);

			if (input.length() > 2) {
				for (int i = 0; i < 2; i++) {
					System.out.print(input.charAt(i));
				}
				for (int i = 0; i < input.length() - 2; i++) {
					System.out.print("*");
				}

			} else {
				System.out.print(input);
			}
			System.out.println();
		}
		scan.close();
	}

}
