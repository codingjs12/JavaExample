package day6;

public class Calculator {

	public void sum(int x, int y) {
		System.out.println("두 수의 합 : " + (x + y));
	}

	public int sum2(int x, int y) {
		return x + y;
	}

	public int multiple(int x, int y, int z) {
		return x * y * z;
	}

	public int multiple(int x, int y) {
		return x * y;
	}
	
	public double multiple(int x, double y) {
		return x * y;
	}

}
