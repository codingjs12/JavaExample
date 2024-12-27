package day1;

public class Variable1 {
	
	public static void main(String[] args) {
		String name = "홍길동";
		
		int studentNumber = 20241226;
		
		int age = 30; //integer(정수)
		
		double height = 170.5; 
		
		boolean isSingle = true; //false
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(isSingle);
		System.out.println(studentNumber);
		
		age = 31;
		
		System.out.println(age);
		
		final double PI = 3.141592;
		//PI = 3.14; 상수라서 수정 불가
		
		System.out.println(PI);
		
		// 홍길동의 나이는 31입니다.

		System.out.println(name + "의 나이는 " + age + " 입니다.");
		
	}

}