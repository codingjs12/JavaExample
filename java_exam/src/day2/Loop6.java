package day2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		scan.close();
		int oddSum = 0;
		int evenSum = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			sum += i;
		}
		System.out.println("홀수들의 합: " + oddSum);
		System.out.println("짝수들의 합 : " + evenSum);
		System.out.println("전체의 합 : " + sum);
		
	}
}