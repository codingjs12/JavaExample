package day18test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
		 * 조건1.배열에 들어가는 숫자는 1부터 100사이의 숫자일 것 조건2. 중복된 숫자는 들어가지 못하게 할 것 조건3. 배열 내림 차순
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int input = scan.nextInt();

			if (input < 1 || input > 100) {
				System.out.println("1~100 사이의 숫자를 입력하세요.");
				i--;
			} else {
				for (int j = 0; j < i + 1; j++) {
					if (input == arr[j]) {
						System.out.println("중복된 숫자는 불가합니다.");
						i--;
						break;
					}
				}

				arr[i] = input;
			}

		}

		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}