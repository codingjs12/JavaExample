package day08;

public class Override1 {

	public static void main(String[] args) {
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 10000;
		
		System.out.println(orange.toString());
	}

}