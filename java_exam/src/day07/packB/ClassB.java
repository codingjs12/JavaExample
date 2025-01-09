package day07.packB;

import day07.packA.ClassA;

public class ClassB extends ClassA{
	
	void test() {
		varPublic = 10; 
//		varDefault = 10; // 다른 패키지 내 접근 불가
//		varProtected = 10; // 다른 패키지 이지만 상속 관계라서 접근 가능
//		varPrivate = 10; // 다른 클래스 내 접근 불가
	}

}
