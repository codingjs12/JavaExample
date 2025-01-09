package day10;

public class Student {

	private int stuNo;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;

	public Student(int stuNo, String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
	}

	public Student(int stuNo, String stuName, String stuDept) {
		this(stuNo, stuName);
		this.stuDept = stuDept;
	}

	public int getAge() {
		return age;
	}

	public void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return stuName + "학생의 학번은 " + stuNo + ", 나이는" + age + "입니다.";
	}
}
