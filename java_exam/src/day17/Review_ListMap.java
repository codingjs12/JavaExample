package day17;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(35);
		list.add(15);

		System.out.println(list);

		HashMap<String, Object> map = new HashMap<>();

		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("name", "김철수");
		map.put("age", 31);

		System.out.println(map);

		ArrayList<HashMap<String, Object>> userList = new ArrayList<>();

		userList.add(map);

		System.out.println(userList);

		for (int i = 0; i < userList.size(); i++) {
			System.out.println("userList.get(i) : " + userList.get(i));
			System.out.println("userList.get(i).get(\"name\") : " + userList.get(i).get("name"));
			System.out.println(userList.get(i).get("age"));
		}

	}
}