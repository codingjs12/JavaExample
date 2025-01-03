package day6;

public class CalcMain {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		int sum = calc.sum2(123, 232);

		System.out.println(sum);

		int b = calc.multiple(5, 2, 3);

		System.out.println(b);

		int a = calc.multiple(1, 2);
		
		System.out.println(a);
		
		double c = calc.multiple(2, 0.4);
		
		System.out.println(c);

	}

}
