package day04;

import java.util.Arrays;
import java.util.Random;

public class Array7 {

	public static void main(String[] args) {

		Random ran = new Random();

		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(45) + 1;
			arr[i] = num;

			for (int j = 0; j < i; j++) {
				if(arr[j] == num) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}