package day04test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요!!! : ");

		int input = scan.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " x " + i + " = " + input * i);
		}
		scan.close();
	}

}
