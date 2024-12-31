package day4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input, min = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print(i + "번째 숫자를 입력하세요!!! : ");
			input = scan.nextInt();

			if (i == 1) {
				min = input;
				continue;
			}

			if (input < min) {
				min = input;
			}
			// min = min > input ? input : min;
			// Math.min(min, input);

		}
		System.out.println("가장 작은 수 : " + min);
		scan.close();
	}

}