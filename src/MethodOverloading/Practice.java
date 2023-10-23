package MethodOverloading;

public class Practice {

	void start() {
		System.out.println("single");
	}

	void start(int a) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		Practice s = new Practice();
		s.start(44);

	}

}
