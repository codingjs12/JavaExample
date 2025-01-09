package day03;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, big = 0;

		System.out.println("정수(양수)를 입력하고 마지막에 -1을 입력하세요!!!");

		while (true) {

			num = scan.nextInt();

			if (num == -1) {
				break;

			} else if (num < -1) {
				System.out.println("0이상의 숫자를 입력해주세요");
			} else {
				big = num > big ? num : big;
			}
		}
		System.out.println("가장 큰 숫자는 : " + big);
		scan.close();

	}

}