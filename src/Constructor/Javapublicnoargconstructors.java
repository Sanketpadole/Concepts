package Constructor;

public class Javapublicnoargconstructors {

	String name;

	// public constructor
	public Javapublicnoargconstructors() {
		name = "Programiz";
	}

	public static void main(String[] args) {

		// object is created in another class
		Javapublicnoargconstructors obj = new Javapublicnoargconstructors();
		System.out.println("Company name = " + obj.name);
	}

}
