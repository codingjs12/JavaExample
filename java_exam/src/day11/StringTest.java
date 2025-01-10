package day11;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");

		String input = scan.next();

		String first, last;

		for (int i = 0; i < input.length(); i++) {
			first = input.substring(0, i + 1);
			last = input.substring(i + 1);
			String str = last + first;
			System.out.println(str);
		}

	}

}
