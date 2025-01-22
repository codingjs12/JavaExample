package day19;

class A {
	int a;

	public void a() {
		System.out.println("Class A");
	}

}

class B extends A {
	int b;

	public void b() {
		System.out.println("Class B");
	}
}

class C extends B {
	int c;

	public void c() {
		System.out.println("Class C");
	}
}

class D extends B {
	int d;

	public void d() {
		System.out.println("Class D");
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		B b = new C();
		A c = new D();
		D d = new D();

		A x = new D();

		System.out.println(x instanceof B);
		System.out.println(x instanceof C);

	}
}