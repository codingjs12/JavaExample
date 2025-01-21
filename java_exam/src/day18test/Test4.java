package day18test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("=== (1) 과일 추가 (2) 과일 삭제 (3) 가격 수정 (4) 현황 파악 (그외) 종료 === ");
			int menu = scan.nextInt();

			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();

				System.out.print("과일 이름 : ");
				String name = scan.next();

				boolean isExist = false;

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("이름"))) {
						System.out.print("과일 개수 :");
						int count = scan.nextInt();
						int num = (int) list.get(i).get("개수") + count;
						if (num > 100) {
							System.out.println("개수는 100을 넘을 수 없습니다.");
						} else {
							list.get(i).put("개수", num);
						}
						isExist = true;
						break;
					}
				}

				if (!isExist) {
					System.out.print("과일 가격 : ");
					int price = scan.nextInt();
					while (true) {
						System.out.print("과일 개수 : ");
						int count = scan.nextInt();
						if (count > 100 || count < 1) {
							System.out.println("개수는 1~100 사이의 값을 입력하세요.");

						} else {
							map.put("개수", count);
							break;
						}
					}

					map.put("이름", name);

					map.put("가격", price);

					list.add(map);
				}

			} else if (menu == 2) {
				System.out.print("삭제할 과일 이름 : ");
				String name = scan.next();

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("이름"))) {
						list.get(i).clear();
						break;
					}
				}

			} else if (menu == 3) {
				System.out.print("가격을 수정할 과일 이름 : ");
				String name = scan.next();

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("이름"))) {
						System.out.print("가격을 수정해주세요. 기존 가격(" + list.get(i).get("가격") + ") ");
						int price = scan.nextInt();
						list.get(i).put("가격", price);

					}
				}

			} else if (menu == 4) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).get("이름") + "의 가격은 " + list.get(i).get("가격") + "원, 개수는 "
							+ list.get(i).get("개수") + "개 남았습니다.");
				}
			} else {
				break;
			}
		}
		scan.close();
	}
}