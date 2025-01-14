package day13;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMap {

	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> user = new HashMap<>();
		
		user.put("name", "홍길동");
		user.put("age", 30);
		
		list.add(user);
		
		System.out.println(list);
		
		HashMap<String, Object> user2 = new HashMap<>();
		
		user2.put("name", "김철수");
		user2.put("age", 20);
		
		list.add(user2);
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user1 = list.get(i);
			if("김철수".equals(list.get(i).get("name"))) {
				list.get(i).put("addr", "인천");
			}
		}
		System.out.println(list);
		
	}
}