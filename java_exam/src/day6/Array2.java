package day6;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		int arr[] = { 3, 5, -4, -10, 8, -5, 6, 2 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		int newArr[] = new int[count];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				newArr[index++] = arr[i]; 
			}
		}
		
		/*
		 for(int num : arr) {
		 	if(num > 0) {
		 		newArr[index++] = num;
		 	}
		 }
		 */
		
		System.out.println(Arrays.toString(newArr));
	}

}