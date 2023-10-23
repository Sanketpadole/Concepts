package Constructor;

public class Javaprivatenoargconstructor {

	private String name;

	// constructor
	Javaprivatenoargconstructor() {
		System.out.println("Constructor Called:");
		name = "Programiz";
	}

	public static void main(String[] args) {

		// constructor is invoked while
		// creating an object of the Main class
		Javaprivatenoargconstructor obj = new Javaprivatenoargconstructor();
		System.out.println("The name is " + obj.name);
	}

}
