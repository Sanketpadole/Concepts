package Constructor;

public class ParameterizedConstructor1 {

	String firstName;
	String lastName;
	int age;

	// constructor
	public ParameterizedConstructor1(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public static void main(String args[]) {
		ParameterizedConstructor1 myStudent = new ParameterizedConstructor1("Ihechikara", "Abba", 100);
		System.out.println(myStudent.age);
	}

}
