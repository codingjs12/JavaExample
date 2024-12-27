package day1;

public class Operator1 {

	public static void main(String[] args) {
		int a = 1;
		a = a + 1;
		a++;
		a--;
		
		System.out.println("a : " + a);
		
		int x = 1;
		int y = x++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		System.out.println("System.out.println(x); // 12 \nSystem.out.println(y); // 10 \nSystem.out.println(z); // 10 ");
		
		x = 10;
		++x; // x = 11 
		y = x++; // x = 12, y = 11
		int z = --y; // y = 10, z = 10
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		a = 1;
		a = a + 1;
		a++;
		++a;
		
		int b = a++;
		b = --a;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		x += y;
		x -= y;
		System.out.println(x);
		System.out.println(y);
		
		x = 5; 
		y = ++x; // x = 6, y = 6
		y = x--; // x = 5, y = 6
		z = x + y; // z = 11
		++x; // x = 6
 		x = z++; // x = 11, z = 12
 		
 		System.out.println(x); // 11
		System.out.println(y); // 6
		System.out.println(z); // 12
		
		x += y;
		
		System.out.println(x); // 17
		System.out.println(y); // 6
	}

}