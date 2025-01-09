package day06;

public class Human {
	protected String name;
	protected int age;
	protected String addr;

	public void study() {
		System.out.println("공부를 합니다!!!");

	}

	public String eat(String food) {
		return food + "(을)를 먹습니다!!!";
	}

	Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		
		System.out.println("생성자를 호출했습니다!!!");
	}
	Human(String name, int age) {
		this(name, age, "알 수 없음");
		
		System.out.println("생성자를 호출했습니다!!!");
	}
	Human(String name) {
		this(name, 10);
	}
}