package SuperKey_And_Paackages;

public class x1 {
	x1() {
		System.out.println(" x ");
	}
}

class y extends x1 {
	y() {
		System.out.println("  y  ");
	}

	y(int a) {
		System.out.println("hello " + a);
	}
}

class z extends y {
	z() {
		super(1);
		System.out.println("  z  ");
	}
}

class date {
	public static void main(String[] args) {
		z y1 = new z();
	}

}
