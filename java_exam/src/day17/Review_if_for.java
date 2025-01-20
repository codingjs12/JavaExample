package day17;

public class Review_if_for {

	public static boolean test(int num1, int num2) {
		System.out.println(num1 + "는 " + num2 + "보다 크다.");
		return num1 > num2;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		if (num1 > num2 && test(num3, num2)) {
			System.out.println("실행");
		}

		int num4 = num1 > num2 ? num1 : num2;

		System.out.println(num4);

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
}