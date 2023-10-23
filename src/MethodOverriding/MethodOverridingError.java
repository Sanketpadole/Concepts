package MethodOverriding;

public class MethodOverridingError {

	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike extends MethodOverridingError {
	public static void main(String args[]) {
		// creating an instance of child class
		Bike obj = new Bike();
		// calling the method with child class instance
		obj.run();
	}

}

//
//Let's understand the problem that we may face in the program if we don't use method overriding.

//Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding.