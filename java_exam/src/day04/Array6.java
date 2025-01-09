package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		int input;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			input = scan.nextInt();
			
			if (input > 0) {
				arr[i] = input;
				
			} else {
				System.out.println("0보다 큰 수를 입력해주세요.");
				i--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}

}