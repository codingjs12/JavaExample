package day8;

public class FruitMain {

	static void fruitBoxing(Fruit f, int num) {
		System.out.println(f.name + " " + num + "개를 박스에 담았습니다.");
	}

//	static void orangeBoxing(Orange o, int num) {
//		System.out.println(o.name + " " + num + "개를 박스에 담았습니다.");
//	}
//
//	static void bananaBoxing(Banana b, int num) {
//		System.out.println(b.name + " " + num + "개를 박스에 담았습니다.");
//	}
//
//	static void appleBoxing(Apple a, int num) {
//		System.out.println(a.name + " " + num + "개를 박스에 담았습니다.");
//	}

	public static void main(String[] args) {

		Orange orange = new Orange();
		orange.name = "오렌지";

		Apple apple = new Apple();
		apple.name = "사과";

		Banana banana = new Banana();
		banana.name = "바나나";

		Fruit pineapple = new Fruit();
		pineapple.name = "파인애플";
		
		banana.print();
		orange.print();
		apple.print();
		
		
		
//		fruitBoxing(orange, 1);
//		fruitBoxing(banana, 2);
//		fruitBoxing(apple, 3);
//		fruitBoxing(pineapple, 4);

	}

}