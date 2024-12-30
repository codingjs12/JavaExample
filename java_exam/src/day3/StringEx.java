package day3;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("입력하세요!!! : ");
		
		String input = scan.next();

		if (input.equals("종료")) {
			System.out.println("종료!!!");
		} else {
			System.out.println("실행 중!!!");

		}

		scan.close();

	}

}
