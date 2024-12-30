package day2;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {

		
		// 단순 if 
//		if(num >= 20) {
//			System.out.println("20보다 크거나 같다.");
//		} 
		
		//else ~ if
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		if(num >= 20) {
			System.out.println("20보다 크거나 같다.");
		} else {
			System.out.println("20보다 작다.");
		}
	
		scan.close();
	}

}
