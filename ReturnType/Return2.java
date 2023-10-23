package ReturnType;

public class Return2 {
	int sum(int x, int y) {
		int z = x + y;
		return z;

	}

	public static void main(String[] args) {
		Return2 re = new Return2();
		re.sum(4, 6);
		System.out.println(re.sum(4, 6));
	}

}
