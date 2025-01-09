package day07.packA;

public class MainA {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.varPublic = 10; 
		a.varDefault = 10; // 같은 패키지 내
		a.varProtected = 10; // 같은 패키지 내
//		a.varPrivate = 10; // 같은 클래스에서만 접근 가능

	}

}
