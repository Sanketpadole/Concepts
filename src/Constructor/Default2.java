package Constructor;

public class Default2 {
	String fName;
	String LName;
	int age;

	Default2() {
		fName = "Ihechikara";
		LName = "Abba";
		age = 100;
	}

	public static void main(String[] args) {
		Default2 myStudent = new Default2();
		System.out.println(myStudent.age);
	}

}
