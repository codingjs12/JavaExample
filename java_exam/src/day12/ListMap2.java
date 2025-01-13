package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {

	static Scanner scan = new Scanner(System.in);

	public static int setScore(String msg, int max) {

		while (true) {
			System.out.print(msg + " 점수 : ");
			int score = scan.nextInt();
			if (score >= 0 && score <= max) {
				return score;
			} else {
				System.out.println("0~" + max + "값을 입력해주세요!!!");
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("[ (1) 추가 (2) 수정 (3) 확인 (4) 종료 ] ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("이름", name);

				map.put("자바", setScore("자바", 45));
				map.put("오라클", setScore("오라클", 30));
				map.put("HTML", setScore("HTML", 25));

				list.add(map);
			} else if (menu == 2) {
				System.out.print("이름 : ");
				String name = scan.next();

//				System.out.print("점수 : ");
//				int score = scan.nextInt();

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("이름"))) {
						System.out.print("과목 : ");
						String subject = scan.next();
						user.put(subject, setScore(subject, 40));
						break;
					}
				}

			} else if (menu == 3) {
				System.out.println(list);
			} else if (menu == 4) {
				break;
			}
		}
	}
}