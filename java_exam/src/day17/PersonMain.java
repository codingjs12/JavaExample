package day17;

public class PersonMain {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 30);
		System.out.println(hong);
		
		Student kim = new Student("김철수", 25, "20201234", 3);
		
		System.out.println(kim);
		
		
		System.out.println(kim.study("자바"));
		
		
		
	}
}