package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {

		int arr[][] = new int[4][2];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(i +","+ j + "번째 숫자를 입력하세요!!! : ");
				arr[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		scan.close();
	}
}