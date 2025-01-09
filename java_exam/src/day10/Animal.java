package day10;

public class Animal {
	
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal() {
		name = "정보없음";
		age = 0;
	}

	public void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}

}