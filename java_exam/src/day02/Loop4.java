package day02;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합을 구하고 싶은 숫자를 입력하세요. : ");
		
		int index = scan.nextInt();
		
		scan.close();
		
		int sum = 0;
		
		for (int i = 1; i <= index; i++) {
			sum += i;
		}	
		
		System.out.println("1부터 " + index + "까지의 합은 " + sum + "입니다.");
	}

}