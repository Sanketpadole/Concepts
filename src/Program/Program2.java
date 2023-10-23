package Program;

public class Program2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				// j = i;
				System.out.print((int) Math.pow(j, i));
			}
			System.out.println();

		}
	}

}
