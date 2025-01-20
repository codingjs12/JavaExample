package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
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
		scan.close();
	}
}