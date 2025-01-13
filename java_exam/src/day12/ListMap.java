package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap {

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		for (;;) {

			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[ (1) 추가 (2) 확인 (3) 종료 ] ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("이름", name);
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				map.put("포인트", point);

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("이름"))) {
						int newPoint = (int) list.get(i).get("포인트");
						newPoint = (int) list.get(i).get("포인트") + point;
						list.get(i).put("포인트", newPoint);
						break;
					}
				}

				list.add(map);

			} else if (menu == 2) {
				System.out.print("이름 : ");
				String name = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("이름"))) {
						System.out.println(list.get(i).get("이름") + "님의 포인트는 " + list.get(i).get("포인트") + "입니다.");
						break;
					}
				}

			} else if (menu == 3) {
				break;

			}
		}
		scan.close();
	}
}