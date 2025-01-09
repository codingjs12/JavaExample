package day09;

public class CalcMain {

	public static void main(String[] args) {

//		Calculator calculator = new Calculator(); // 추상클래스는 객체생성 불가능

		GoodCalc calc = new GoodCalc();

		int div = calc.div(5, 10);
		int mod = calc.mod(5, 2);
		int sum = calc.sum(3, 2);
		int mul = calc.mul(3, 5);
		int sub = calc.sub(10, 5);

	}

}
