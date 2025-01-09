package day04test;

public class Test5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {
			if (i >= 10 && i <= 19) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
