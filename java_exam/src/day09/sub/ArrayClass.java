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

	public static int minvalue(int arr[]) {
		int min = arr[0];
		for (int value : arr) {
			min = value < min ? value : min;
		}
		return min;
	}

	public static int minIndex(int arr[]) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[index] > arr[i]) {
				index = i;
			}
		}
		return index;
	}

	public static void maxMinchange(int arr[]) {

		int max = 0;
		int min = 0;

		for (int i = 1; i < arr.length; i++) {
			max = arr[i] > arr[max] ? i : max;
			min = arr[i] < arr[min] ? i : min;
		}

		int temp;
		temp = arr[max];
		arr[max] = arr[min];
		arr[min] = temp;

	}

}