package day10;

public class Dog extends Animal {
	
	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public Dog() {
		super();
	}

	public void info() {
		super.info();
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍!!!");
	}
	
	public String getBreed() {
		return breed;
	}

}
