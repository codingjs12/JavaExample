package day10;

public class SampleMain {

	public static void main(String[] args) {

		Sample s1 = new Sample("홍길동", 30);

		s1.age = 31;

		Sample s2 = new Sample("김철수", 35);

		s2.age = 36;

		Sample s1_sub = s1.obj();

		System.out.println(s1_sub.age);
		System.out.println(s1_sub.name);

	}

}
