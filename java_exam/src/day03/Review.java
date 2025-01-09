package day03;

public class Review {

	public static void main(GuGudan[] args) {
		// 1~30 중에서 num이 3의 배수이면서 5의 배수인 숫자 출력

		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
			System.out.println(i);
			}
		}

	}

}