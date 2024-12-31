package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

}