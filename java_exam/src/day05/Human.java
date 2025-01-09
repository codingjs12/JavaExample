package day05;

public class Human {

	protected String name;
	protected int age;
	protected String addr;
	protected double height;
	protected boolean isSingle;

	public void speak(String name) {
		System.out.println(name + "(이)가 말한다!!!");
	}

	public void eat() {
		System.out.println("맛있는걸 먹는다!!!");
	}

	public void intro(String name, int age, String addr) {
		System.out.println(name + "의 나이는 " + age + ", 주소는 " + addr + "입니다!!!");

	}

	public void intro(String name) {
		System.out.println(name + "의 나이는 " + age + ", 주소는 " + addr + "입니다!!!");
		System.out.println(name + "의 본명은 " + this.name);
	}

}