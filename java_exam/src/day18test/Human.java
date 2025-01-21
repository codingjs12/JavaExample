package day18test;

public class Human {
	
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean setPhone(String phone) {
		if(phone.length() == 11) {
			return false;
		} else {
			System.out.println("휴대폰 번호는 11글자로 입력해주세요. ( - 제외 )");
			return true;
		}
	}
	
	public String toString() {
		return name + "의 나이는 " + age + "입니다.";
	}

}
