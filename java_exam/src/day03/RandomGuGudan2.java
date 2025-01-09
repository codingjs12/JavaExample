package day03;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int x, y, answer, total = 0, count = 0;
		double score = 0;
		System.out.println("랜덤 구구단 입니다!!! 0을 입력하면 종료됩니다!!!");

		while (true) {
			x = ran.nextInt(8) + 2; // 2~9
			y = ran.nextInt(9) + 1; // 1~9
			System.out.print(x + " x " + y + " = ");
			answer = scan.nextInt();

			if (answer == 0) {
				break;

			} else if (answer == x * y) {
				count++;
				total++;
				System.out.println("정답입니다!!! 현재 " + total +"문제 중 "+ count + "문제 정답");
			} else {
				total++;
				System.out.println("오답입니다!!! 정답은 " + x * y + " 입니다!!!");
				System.out.println("현재 " + total +"문제 중 "+ count + "문제 정답");
			}

		}

		System.out.println("종료!!! " + total + "문제 중 " + count + "문제 맞추셨습니다!!!");

		score = (double) count / (double) total * 100;

		System.out.println("점수는 : " + score);
		scan.close();

	}

}