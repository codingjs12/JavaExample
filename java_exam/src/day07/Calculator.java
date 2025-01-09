package day07;

public class Calculator {

	public int sum(int x, int y) {
		return x + y;
	}

	public void intro() {
		System.out.println("계산기 객체 입니다.");
	}

	public double sum(double x, double y) {
		return (x + y);
	}

	public int sum(int x, int y, double z) {
		return (int) (x + y + z);
	}

}
