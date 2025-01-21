package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = scan.next();

			map.put("이름", name);

			System.out.print("나이 : ");
			int age = scan.nextInt();
			map.put("나이", age);

			System.out.print("주소 : ");
			String addr = scan.next();
			map.put("주소", addr);

			list.add(map);
		}

		System.out.println(list);

		System.out.print("수정할 사용자 입력 : ");
		String name = scan.next();
		boolean userFlg = false;

		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			if (map.get("이름").equals(name)) {
				System.out.println(map);
				userFlg = true;
				break;
			}
		}
		if (userFlg == false) {
			System.out.println("없는 사용자");
		}

		scan.close();
	}
}