package day5;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human();
		
		Human kim = new Human();
		
		hong.speak("홍길동");
		hong.eat();
		
		hong.name = "홍길동";
		hong.age = 30;
		hong.addr = "인천";
		hong.height = 170.5;
		hong.isSingle = true;
		
		System.out.println(hong.name);
		
		
		kim.speak("김철수");
		kim.eat();
		
		
	}

}