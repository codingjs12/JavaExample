package day9.sub;

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
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxValue(array) == array[i]) {
				maxIndex = i;
			}
		}

		return maxIndex;
	}

}