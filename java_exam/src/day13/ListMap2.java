package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);

	public static int setNumber(String msg, int min, int max) {
		while (true) {
			System.out.print(msg + ": ");
			int number = scan.nextInt();
			if (number >= min && number <= max) {
				return number;
			}
			System.out.println(min + "~" + max + " 값을 입력해주세요!!!");
		}
	}

	public static boolean isExist(ArrayList<HashMap<String, Object>> list) {
		System.out.print("과일 이름 : ");
		String name = scan.next();
		HashMap<String, Object> map;
		for (int i = 0; i < list.size(); i++) {
			map = list.get(i);
			if (name.equals(map.get("name"))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("[(1) 추가 (2) 판매 (3) 확인 (4) 종료 ] ");

			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("과일 이름 : ");
				String name = scan.next();
				map.put("name", name);

				boolean updateFlg = false;

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("name"))) {
						int num = setNumber("과일 개수", 1, 300);
						user.put("num", num + (int) user.get("num"));
						updateFlg = true;
						break;
					}
				}

				if (!updateFlg) {
					int price = setNumber("과일 가격", 100, 100000);
					map.put("price", price);
					int num = setNumber("과일 개수", 1, 300);
					map.put("num", num);
					list.add(map);
				}
//				while (true) {
//					System.out.print("과일 가격 : ");
//					int price = scan.nextInt();
//					if (price >= 100 && price <= 100000) {
//						map.put("price", price);
//						break;
//					} else {
//						System.out.println("100~100,000 숫자를 입력하세요!!!");
//					}
//				}

//				while (true) {
//					System.out.print("과일 개수 : ");
//					int num = scan.nextInt();
//					if (num >= 1 && num <= 300) {
//						map.put("num", num);
//						break;
//					} else {
//						System.out.println("1~300 숫자를 입력하세요!!!");
//					}
//				}
			} else if (menu == 2) {
					if (isExist(list)) {
						System.out.println("판매 개수 : ");
						int num = scan.nextInt();
						if (num > (int) map.get("num")) {
							System.out.println("재고가 부족합니다.");
							System.out.println("현재 남은 개수는 : ");
						} else {
							map.put("num", (int) map.get("num") - num);
						}
					}
			} else if (menu == 3) {
				System.out.print("과일 이름 : ");
				String name = scan.next();
				for(int i = 0; i < list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) 
						System.out.println(
								name +"의 가격은 " + fruit.get("price") +
								", 개수는 "+fruit.get("num")+"개 남았습니다.");
					}
			} else if (menu == 4) {
				System.out.println("종료합니다!!!");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다!!!");
			}
		}scan.close();
}}