package day7.packB;

import day7.packA.ClassA;

public class MainB {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.varPublic = 10; 
//		a.varDefault = 10; // 다른 패키지 내 접근 불가
//		a.varProtected = 10; // 다른 패키지 내 접근 불가
//		a.varPrivate = 10; // 다른 클래스 내 접근 불가

	}

}
