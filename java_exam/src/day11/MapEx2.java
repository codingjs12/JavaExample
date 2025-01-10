package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<>();

			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] ");
			int index = scan.nextInt();

			if (index == 1) {
				System.out.print("이름 : ");
				map.put("name", scan.next());

				System.out.print("나이 : ");
				map.put("age", scan.next());

				System.out.print("주소 : ");
				map.put("addr", scan.next());

				list.add(map);

			} else if (index == 2) {

				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ". ");
					System.out.print("이름 : " + list.get(i).get("name") + ", ");
					System.out.print("나이 : " + list.get(i).get("age") + ", ");
					System.out.println("주소 : " + list.get(i).get("addr"));
				}

			} else if (index == 3) {
				boolean find = false;
				System.out.print("삭제 할 이름 : ");
				String delete = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (delete.equals(list.get(i).get("name"))) {
						list.remove(i);
						find = true;
						break;
					}
				}
				if (find == false) {
					System.out.println("없는 이름입니다!!!");
				}
				if (find == true) {
					System.out.println("삭제 되었습니다!!!");
				}
			} else if (index == 4) {
				System.out.println("종료!!!");
				break;
			} else {
				System.out.println("1 ~ 3번 중에 선택하세요!!!");
			}
		}
		scan.close();
	}

}