package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		while (true) {
			System.out.print("문자열을 입력하세요 : ");
			String input = scan.next();
			if (input.equals("그만")) {
				break;
			}
			list.add(input);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).length() >= 3) {
					System.out.print(list.get(i).substring(0, 2));
					for (int j = 0; j < list.get(i).length() - 2; j++) {
						System.out.print("*");
					}
				}
				System.out.print(" ");
			}
		}
		scan.close();
	}
}