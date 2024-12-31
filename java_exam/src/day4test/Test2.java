package day4test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요!!! : ");
		int input = scan.nextInt();
		if (input >= 50) {
			System.out.println("50 이상 입니다.");

		} else {
			System.out.println("50 미만 입니다.");

		}
		scan.close();
	}

}
