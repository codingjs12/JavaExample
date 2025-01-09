package day09.sub;

public class ArrayClass {

	public static int maxValue(int[] array) {

		int max = array[0];
		for (int value : array) {
			if (max < value) {
				max = value;
			}

		}
		return max;
	}

	public static int maxIndex(int[] array) {
		int index = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}

		return index;
	}
	
	public static int minIndex(int arr[]) {
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[index] > arr[i]) {
				index = i;
			}
		}
		return index;
	}
	
	public static void change(int arr[]) {
		int temp;
		temp = arr[maxIndex(arr)];
		arr[maxIndex(arr)] = arr[minIndex(arr)];
		arr[minIndex(arr)] = temp;
		
	}
	

}