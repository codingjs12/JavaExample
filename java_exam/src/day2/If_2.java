package day2;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력 받아서
		// 입력받은 숫자가 홀수 인지 짝수 인지 판별
		// 홀수면 "홀수 입니다."
		// 짝수면 "짝수 입니다."
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		boolean isEven = num % 2 == 0;
		
		if(isEven) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}

}
