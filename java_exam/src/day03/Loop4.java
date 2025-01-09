package day03;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int result = 0;
		int menu;
		while (true) {
			System.out.println("==== 메뉴 선택 ====");
			System.out.println("(1) 덧셈 (2) 뺄셈 (3) 결과 (4) 종료");

			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("덧셈을 할 숫자를 입력하세요.");
				result += scan.nextInt();

			} else if (menu == 2) {
				System.out.println("뺄셈을 할 숫자를 입력하세요.");
				result -= scan.nextInt();

			} else if (menu == 3) {
				System.out.println("결과 : " + result);

			} else if (menu == 4) {
				System.out.println("종료합니다!!!");
				break;

			} else {
				System.out.println("1부터 4까지의 숫자를 입력하세요!!!");
			}

		}

		scan.close();
	}

}
