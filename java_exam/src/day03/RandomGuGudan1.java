package day03;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int answer;
		int score = 0;
		int x, y;
		int count = 0;
		for (int i = 0; i < 10; i++) {

			x = ran.nextInt(8) + 2; // 2~9
			y = ran.nextInt(9) + 1; // 1~9

			System.out.print(x + " x " + y + " = ");
			answer = scan.nextInt();
			
			if (answer == x * y) {
				System.out.println("정답!!!");
				score += 10;
				count++;
			} else {
				System.out.println("오답입니다!!! 정답은 " + x * y + " 입니다.");
			}

		}
		
		System.out.println("종료!!! 점수는 : " + score + " 맞춘 문제 수 : " + count);
		scan.close();

	}

}
