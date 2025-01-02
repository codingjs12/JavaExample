package day5;

import java.util.Arrays;

public class SelectionSort3 {

	public static void main(String[] args) {
		int arr[] = { 5, 1, 3, 2, 4 };
		int temp, minIndex = 0;

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		
		temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		minIndex = 1;
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;
		minIndex = 2;
		for(int i = 3; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;
		minIndex = 3;
		for(int i = 4; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		
		temp = arr[3];
		arr[3] = arr[minIndex];
		arr[minIndex] = temp;
		
		temp = arr[4];
		arr[4] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));

	}

}