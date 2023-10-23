package Program;

public class program {

	public static void main(String[] args) {

		int num = 999
				2;
		int rem = 0;
		int count = 0;
		for (int i = 0; i <= num; i++) {
			rem = num % 10;
			num = num / 10;
			count++;

		}
		System.out.println(rem);
	}

}
