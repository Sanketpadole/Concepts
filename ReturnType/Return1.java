package ReturnType;

public class Return1 {

	int greater(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String ar[]) {
		Return1 re = new Return1();
		System.out.println(re.greater(5, 7));

	}

}
