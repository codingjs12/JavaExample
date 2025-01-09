package day08;

public class PersonMain {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 30, "서울");
		hong.eat();
		hong.sleep();

		Student kim = new Student("김철수", 20, "인천");
		kim.eat();
		kim.sleep();
		kim.study();

		Student park = new Student("박영희", 20, "제주도", "12341234");

	}

}