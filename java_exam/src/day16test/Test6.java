package day16test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("=== 학생 관리 시스템 입니다! ===");
		while (true) {
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료] ");
			int menu = scan.nextInt();
			if (menu == 1) {
				boolean isExist = false;
				System.out.print("이름 입력 : ");
				String name = scan.next();
				HashMap<String, Object> map = new HashMap<>();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동합니다.");
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("학생이 추가되었습니다!");
					map.put("name", name);
					list.add(map);
				}

			} else if (menu == 2) {
				boolean isExist = false;
				System.out.print("이름 입력 : ");
				String name = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						while (true) {
							System.out.print("java :");
							int java = scan.nextInt();
							if (java < 0 || java > 100) {
								System.out.println("0~100값을 입력하세요.");
							} else {
								list.get(i).put("java", java);
								break;
							}
						}
						while (true) {
							System.out.print("oracle :");
							int oracle = scan.nextInt();
							if (oracle < 0 || oracle > 100) {
								System.out.println("0~100값을 입력하세요.");
							} else {
								list.get(i).put("oracle", oracle);
								break;
							}
						}
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("없는 사용자 입니다.");
				}
			} else if (menu == 3) {
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
			} else if (menu == 4) {
				boolean isExist = false;
				System.out.print("이름 입력 : ");
				String name = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.print("수정할 과목명 (java, oracle) : ");
						String input = scan.next();
						if (input.equals("java")) {
							System.out.print("java : ");
							int java = scan.nextInt();
							list.get(i).put("java", java);
						} else if (input.equals("oracle")) {
							System.out.print("oracle : ");
							int oracle = scan.nextInt();
							list.get(i).put("oracle", oracle);
						} else {
							System.out.println("존재하지 않는 과목입니다.");
						}
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("없는 사용자입니다.");
				}
			} else if (menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		scan.close();
	}
}