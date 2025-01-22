package day19;

import java.util.Arrays;
import java.util.Scanner;

public class TestNo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			while(true) {
				System.out.print("1~100사이의 값을 입력하세요 : ");
				int input = scan.nextInt();
				if(input > 100 || input < 1) {
					System.out.println("범위 초과!!!");
				} else {
					boolean inputFlg = false;
					for(int j = 0; j < i; j++) {
						if(input == arr[j]) {
							System.out.println("중복된 값 있음");
							inputFlg = true;
						}
					}
					if(!inputFlg) {
						arr[i] = input;
						break;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}