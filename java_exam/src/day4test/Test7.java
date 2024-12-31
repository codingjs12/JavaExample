package day4test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int answer = ran.nextInt(100) + 1;
		int input = 0, count = 1;

		while (true) {
			System.out.print("숫자를 입력하세요!!! : ");

			input = scan.nextInt();

			if (answer > input) {
				System.out.println("UP!");
				count++;
			} else if (answer < input) {
				System.out.println("DOWN!");
				count++;
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}
		System.out.println(count + "번 만에 맞추셨습니다.");

	}

}
