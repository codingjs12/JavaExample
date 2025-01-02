package day5;

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

}