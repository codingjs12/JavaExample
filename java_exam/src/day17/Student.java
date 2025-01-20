package day17;

import java.util.HashMap;

public class Student extends Person {

	private String stuNo;
	private int grade;

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, String stuNo, int grade) {
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return super.toString() + "\n학번은 " + stuNo + ", 학년은 " + grade + "학년 입니다.";
	}

	public String study(String subject) {
		return subject + "는 재밌다!";
	}

	public HashMap<String, Object> getInfo() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("stuNo", stuNo);
		map.put("grade", grade);
		return map;
	}

}