package day08;

public class Orange extends Fruit {

	@Override
	public void print() {
		System.out.println("오렌지는 달다!!!");
	}

	@Override
	public String toString() {
		return "과일명 : " + name + ", 색 : " + color + ", 가격 : " + price;
	}

}