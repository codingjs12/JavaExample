package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();

		
		for(int i = 0; i < 3; i++) {
			System.out.print("이름 : ");
			String name = scan.next();
			
			System.out.print("나이 : ");
			int age = scan.nextInt();
			
			System.out.println("주소 : ");
			String addr = scan.next();
			
			Human h = new Human(name, age, addr);
			
			list.add(h);
			
		}
		
		System.out.println(list);
		
		scan.close();
	}

}
