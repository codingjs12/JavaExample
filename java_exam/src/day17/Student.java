package day17;

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
	
	public String study(String sub) {
		return sub + "는 재밌다!";
	}

}