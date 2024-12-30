package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan3 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int answer, x, y, total, count = 0;

		while (true) {
			System.out.println("문제 수를 입력하세요!!! 0이하 숫자 입력시 종료 됩니다!!!");
			total = scan.nextInt();

			if (total <= 0) {
				System.out.println("종료!!!");
				break;

			} else {
				for (int i = 0; i < total; i++) {

					x = ran.nextInt(8) + 2;
					y = ran.nextInt(9) + 1;

					System.out.print(x + " x " + y + " = ");

					answer = scan.nextInt();

					if (answer == x * y) {
						System.out.println("정답입니다!!!");
						count++;

					} else {
						System.out.println("오답입니다!!! 정답은 : " + x * y);

					}
				}

				System.out.println(total + "문제 중 " + count + "문제 맞추셨습니다!!!");
				System.out.println();
				count = 0;
			}

		}
		scan.close();

	}

}