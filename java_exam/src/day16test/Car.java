package day16test;

public class Car implements CarManager{
	private String kind;
	private int speed;
	private String color;

	public Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "차 종류는 " + kind + ", 색은 " + color + "입니다.";
	}
	
	@Override
	public void speedUp(int speed) {
		if (this.speed + speed > 200) {
			System.out.println("200 초과의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		} else {
			this.speed = this.speed + speed;
		}

	}
	
	@Override
	public void speedDown(int speed) {
		if (this.speed - speed < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		} else {
			this.speed = this.speed - speed;
		}
	}
	
	@Override
	public int getSpeed() {
		return speed;
	}

	public static void main(String[] args) {
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);
		c.speedUp(100);
		System.out.println(c.getSpeed()); // 100
		c.speedUp(150);
		System.out.println(c.getSpeed()); // 200
		c.speedDown(30);
		System.out.println(c.getSpeed()); // 170
	}
}