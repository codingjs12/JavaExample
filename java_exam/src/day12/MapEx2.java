package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {

	public static void main(String[] args) {

		HashMap<String, Object> map = new HashMap<>();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.5);

		list.add(map);
		System.out.println(list);

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map2 = new HashMap<>();
			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			map2.put("name", name);

			System.out.print("나이를 입력하세요 : ");
			int age = scan.nextInt();
			map2.put("age", age);

			System.out.print("키를 입력하세요 : ");
			double height = scan.nextDouble();
			map2.put("height", height);

			list.add(map2);
		}

		System.out.println(list);
		scan.close();
	}
}