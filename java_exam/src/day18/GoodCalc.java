package day18;

public class GoodCalc implements Calculator {

	public static void main(String[] args) {

	}

	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int sum(int x, int y, int z) {
		return x + y + z;
	}

	@Override
	public int multiple(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		int z = 0;
		try {
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return z;
	}

	public int max(int x, int y) {
		return x > y ? x : y;
	}

}