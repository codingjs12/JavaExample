package day05;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 4, 1 };
		int temp;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}