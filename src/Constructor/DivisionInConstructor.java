package Constructor;

public class DivisionInConstructor {

	int a;
	int b;

	DivisionInConstructor() {
		this.a = 5;
		this.b = 9;
	}

	public static void main(String[] args) {
		DivisionInConstructor dd = new DivisionInConstructor();
		System.out.println(dd.a);

	}

}
