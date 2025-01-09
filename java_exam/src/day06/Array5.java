package day06;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		Random ran = new Random();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int num = ran.nextInt(20) + 1;
				arr[i][j] = num;
				sum += arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));

		}

		System.out.println((double) sum / (arr[0].length * arr.length) );

	}
}