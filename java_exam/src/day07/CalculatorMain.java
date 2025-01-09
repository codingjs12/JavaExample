package day07;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		calc.intro();

		int sum = calc.sum(10, 5);

		System.out.println(sum);

		double sum2 = calc.sum(1.1, 0.1);

		System.out.println(sum2);

		boolean isTrue = 1.1 + 0.1 == sum2;

		sum = calc.sum(10, 20, 30.5);

		System.out.println(sum);

		System.out.println(isTrue);

	}

}
