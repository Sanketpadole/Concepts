package Constructor;

public class ConstructorOverloadingEx {

	int a;

	int b;

	ConstructorOverloadingEx() {
		System.out.println("default");

	}

	ConstructorOverloadingEx(int a) {
		System.out.println("single param");

	}

	public static void main(String[] args) {
		ConstructorOverloadingEx tt = new ConstructorOverloadingEx(55);

	}

}
