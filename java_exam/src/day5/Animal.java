package day5;

public class Animal {
	protected String name;
	protected int age;

	public void eat(String name) {
		System.out.println(name + "가 먹는다!!!");
	}

	public void speak(String name) {
		System.out.println(name + "가 말한다!!!");
	}

	public void love(String name, int age) {
		System.out.println(age + "살먹은 " + name + "가 사랑한다!!!");
	}

}
