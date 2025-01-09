package day04;

public class Array4 {

	public static void main(String[] args) {
		
		int arr[] = { 3, 5, 2, 7, 10 };
		
		int sum = 0, max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			sum += arr[i];
		}
		
		System.out.println("배열의 합 : " + sum + " 배열의 최대값 : " + max);
	}

}