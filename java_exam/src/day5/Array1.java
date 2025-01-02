package day5;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {

		Random ran = new Random();

		int arr[] = new int[6];

		int ranNum;

		for (int i = 0; i < arr.length; i++) {
			ranNum = ran.nextInt(45) + 1;
			arr[i] = ranNum;
			for (int j = 0; j < i; j++) {
				if (arr[j] == ranNum) {
					System.out.println("중복된 숫자 있음.");
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}