package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNo4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Human hong = new Human("홍길동", 30);
		System.out.println(hong);

		boolean flg = true;

		while (flg) {
			System.out.print("핸드폰번호 입력 : ");
			String phone = scan.next();
			flg = hong.setPhone(phone);
		}

		Student kim = new Student("김철수", 30, "20201234");
		System.out.println(kim);
		System.out.println("---- 수강해야할 과목 ----");

		ArrayList<String> list = kim.subjectList();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		scan.close();
	}
}