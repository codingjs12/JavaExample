package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("나뉘는 수 : ");
				int num1 = scan.nextInt();
				System.out.print("나눌 수 : ");
				int num2 = scan.nextInt();
				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다!!!");
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요!!!");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("예기치 못한 에러 발생!!!");
			}
		}
		scan.close();
	}
}