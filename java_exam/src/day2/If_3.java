package day2;

import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		// 다중 else ~ if
		Scanner scan = new Scanner(System.in);
		
		int score = 100;
		
		if(score >= 90) {
			System.out.println(score + ": A");
			
		} else if (score >= 80) {
			System.out.println(score + ": B");
			
		} else if (score >= 70) {
			System.out.println(score + ": C");
			
		} else {
			System.out.println(score + ": F");
		}
	}

}
