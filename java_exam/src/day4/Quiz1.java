package day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0, min = 0, sum = 0, input;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 숫자를 입력하세요!!! : ");

			input = scan.nextInt();

			if (i == 1) {
				max = input;
				min = input;

			} else {

				if (input > max) {
					max = input;
				}

				if (input < min) {
					min = input;
				}

			}

			sum += input;
		}

		System.out.println("가장 큰 수 : " + max + " 가장 작은 수 : " + min + " 평균 : " + (double) (sum / 5));

		scan.close();
	}

}