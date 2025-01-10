package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();

		while (true) {
			System.out.println("(1) 추가 (2) 확인 (3) 종료 ");
			int index = scan.nextInt();

			if (index == 1) {
				System.out.print("이름 : ");
				String name = scan.next();

				System.out.print("나이 : ");
				int age = scan.nextInt();

				System.out.print("주소 : ");
				String addr = scan.next();

				Human h = new Human(name, age, addr);

				list.add(h);
			} else if (index == 2) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". 이름 : " + list.get(i).getName() + ", 나이 : " + list.get(i).getAge()
							+ ", 주소 : " + list.get(i).getAddr());
				}
			} else if (index == 3) {
				break;
			}
		}

		scan.close();

	}

}
