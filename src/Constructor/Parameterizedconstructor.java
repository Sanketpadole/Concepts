package Constructor;

public class Parameterizedconstructor {

	String languages;

	// constructor accepting single value
	Parameterizedconstructor(String lang) {
		languages = lang;
		System.out.println(languages + " Programming Language");
	}

	public static void main(String[] args) {

		// call constructor by passing a single value
		Parameterizedconstructor obj1 = new Parameterizedconstructor("Java");
		Parameterizedconstructor obj2 = new Parameterizedconstructor("Python");
		Parameterizedconstructor obj3 = new Parameterizedconstructor("C");
	}

}
