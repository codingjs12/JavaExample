package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input, arr[];

		while (true) {
			System.out.print("배열 크기를 입력하세요!!! : ");
			input = scan.nextInt();

			if (input > 0) {
				arr = new int[input];
				for (int i = 0; i < arr.length; i++) {
					System.out.print("숫자를 입력하세요!!! : ");
					input = scan.nextInt();
					if (input > 0) {
						arr[i] = input;
					} else {
						System.out.println("0이상의 양의 정수를 입력하세요");
						i--;
					}
				}
				break;
			} else {
				System.out.println("0이상의 정수를 입력하세요.");
			}

		}

		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}