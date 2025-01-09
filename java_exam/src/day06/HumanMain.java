package day06;

public class HumanMain {

	public static void main(String[] args) {

		Human hong = new Human("홍길동", 30, "인천");

		String eat = hong.eat("사과");
		System.out.println(eat);
		hong.study();
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.addr);

		Human kim = new Human("김철수", 25, "제주도");
		
		Human park = new Human("박영희" , 35);
		
		System.out.println(park.addr);
		
		
	}

}
