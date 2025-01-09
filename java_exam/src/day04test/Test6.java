package day04test;

public class Test6 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			if (i == 5 || i == 8) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);

			}
		}
	}
}
