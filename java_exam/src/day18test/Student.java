package day18test;

import java.util.ArrayList;

public class Student extends Human {

	private String stuNo;
	
	public Student(String name, int age, String stuNo) {
		super(name, age);
		this.stuNo = stuNo;
		
	}

	public ArrayList<String> subjectList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("오라클");
		list.add("HTML");
		
		return list;
	}

}
