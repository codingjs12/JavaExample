package day16test;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("1부터 100사이의 숫자를 입력하세요. 5의 배수는 입력할 수 없습니다. ");
			int input = scan.nextInt();

			if (input >= 1 && input <= 100) {
				if (!(input % 5 == 0)) {
					arr[i] = input;
				} else {
					System.out.println("5의 배수는 넣을수 없습니다.");
					i--;
				}
			} else {
				System.out.println("1부터 100사이의 숫자를 입력하세요");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}