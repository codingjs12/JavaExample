package day09.sub;

public class ArrayRef {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 4, 2 };

		int arr2[] = arr;

//		arr2[3] = 100;

		System.out.println(arr[3]);

		int max = ArrayClass.maxValue(arr2);

		System.out.println(max);
		
		int maxIndex = ArrayClass.maxIndex(arr2);
		
		System.out.println(maxIndex);

	}
}