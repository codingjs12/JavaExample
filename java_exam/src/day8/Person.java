package day8;

public class Person {

	String name;
	int age;
	String addr;

	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Person() {
		System.out.println("부모 클래스 생성자 실행!!!");
	}

	public void eat() {
		System.out.println(name + "(이)가 먹는다!!!");
	}

	public void sleep() {
		System.out.println(name + "(이)가 잔다!!!");
	}

}