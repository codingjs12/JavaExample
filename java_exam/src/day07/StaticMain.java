package day07;

public class StaticMain {

	public static void main(String[] args) {

//		System.out.println(StaticEx1.num); // static이 아니면 객체를 만들어서 접근

		System.out.println(StaticEx1.PI);

		int num = StaticEx1.staticSum(10, 20);

		System.out.println(num);

		StaticEx1 ex1 = new StaticEx1();
		ex1.money = 45000;

		StaticEx1 ex2 = new StaticEx1();
//		ex2.money = 20000;

		System.out.println(ex1.money);

		System.out.println(ex2.money);
	}

}