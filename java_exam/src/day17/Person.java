package day17;

public class Person {

	private String name;
	private int age;
	private String mbti;

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public void eat(String food) {
		System.out.println(food + "를 먹는다.");
	}

	@Override
	public String toString() {
		return getName() + "의 mbti는 " + mbti + "입니다.";
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public String getMbti() {
		return mbti;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}