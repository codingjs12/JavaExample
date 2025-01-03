package day5;

public class AnimalMain {

	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.eat("무파사");
		lion.age = 4;
		
		
		Animal bear = new Animal();
		bear.name = "화이트베어";
		bear.age = 8;
		
		bear.speak(bear.name);

		bear.love(bear.name, bear.age);
	}

}