package day3;

public class Loop2While {

	public static void main(String[] args) {

		int i = 2;
		int j;
		while (i <= 9) {

			if (i % 2 == 0) {
				j = 1;
				System.out.println("==== " + i + "단 ====");
				while (j <= 9) {
					System.out.println(i + "x" + j + "=" + i * j);
					j++;
				}
				System.out.println();
			}
			i++;
		}

	}

}