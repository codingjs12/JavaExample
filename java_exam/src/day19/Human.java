package day19;

public class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		String str = name + "의 나이는 " + age + "입니다."; 
		return str;
	}
	
	boolean setPhone(String phone) {
		if(phone.length() == 11) {
			return false;
		} else {
			System.out.println("핸드폰번호 '-' 제거 하고 입력");
			System.out.println("ex) 01023201101");
			return true;
		}
		
	}

}