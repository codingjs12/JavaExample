package day5;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 1 };
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
