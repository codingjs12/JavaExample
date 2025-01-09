package day04;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 4, 1 };
		int max = 0, maxIndex = 0, minIndex = 0, temp;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			minIndex = arr[i] < arr[minIndex] ? i : minIndex;
		}

		System.out.println("가장 큰 값의 위치 : " + (maxIndex + 1) + " 가장 작은 값의 위치 : " + (minIndex + 1));

		temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;

		System.out.println(Arrays.toString(arr));
	}
}