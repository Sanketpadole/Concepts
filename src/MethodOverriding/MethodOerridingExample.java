package MethodOverriding;

public class MethodOerridingExample {

	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends MethodOerridingExample {
	// defining the same method as in the parent class
	@Override
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
	}

}

//In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation.
//The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.