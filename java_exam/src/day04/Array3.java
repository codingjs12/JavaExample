package day04;

public class Array3 {

	public static void main(String[] args) {
		int a = 10;
		int b = a;

		a = 30;

		System.out.println("a : " + a + " b : " + b);

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = arr1;

		arr1[0] = 100;

		System.out.println("arr2[0] : " + arr2[0]);
	}

}