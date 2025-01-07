package day8;

public class Student extends Person {

	String stuNo; // 학번
	int grade; // 학년

	public void study() {
		System.out.println(name + "(이)가 공부하고 있습니다!!!");
	}

	public Student(String name, int age, String addr) {
		super(name, age, addr);
	}

	public Student(String name, int age, String addr, String stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}

	public Student() {
		System.out.println("자식 클래스 생성자 실행!!!");
	}

}