package Super_subclass;

public class Vehicle {

	private int wheels;

	public Vehicle(int wheels) {
		this.wheels = wheels;
		System.out.println("Vehicle created with " + wheels + " wheels");
	}

	public static void main(String[] args) {
		Car c = new Car(12, "jkkk");

	}
}

class Car extends Vehicle {
	private String color;

	public Car(int wheels, String color) {
		super(wheels);
		this.color = color;
		System.out.println("Car created with " + color + " color");
	}

}
