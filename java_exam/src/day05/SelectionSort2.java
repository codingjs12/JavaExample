package day05;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 2, 4 };
		int temp;
		
		for(int i = 0; i < 4; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}