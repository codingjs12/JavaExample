package day18;

public class Pig extends Animal {

	public Pig(String name, int age) {
		super(name, age);
	}

	@Override
	public void sound() {
		System.out.println("꿀꿀");
	}
	
}