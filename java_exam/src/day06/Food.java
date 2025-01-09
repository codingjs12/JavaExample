package day06;

public class Food {

	private String name;
	private int price;

	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sell() {
		System.out.println(price + "원에 판매 했습니다.");
	}

	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("가격을 다시 확인해주세요");
		}
		System.out.println("정말 " + price + "가 맞습니까?");
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
