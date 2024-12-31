package day4test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요!!! : ");

		int input = scan.nextInt();

		if (input <= 0 || input >= 11) {
			System.out.println("계산할 수 없습니다.");
		} else {
			if (input % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		scan.close();
	}

}
