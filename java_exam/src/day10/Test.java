package day10;

public class Test {

	public static void addNum(int n) {
		n++;
	}

	public static void addArr(int arr[]) {
		arr[0] = 100;
	}

	public static void main(String[] args) {

		int n = 10;
		addNum(n);
		System.out.println(n);

		int arr[] = { 1, 3, 5 };

		addArr(arr);

		System.out.println(arr[0]);
		
	}

}