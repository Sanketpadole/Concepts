package Interface;

public class Program {

	public static void main(String[] args) {

		int num = 999;
		int rem;
		int count = 0;
		for (int i = 0; i <= num; i++) {
			count = num % 10;
			num = num / 10;
			count++;

		}
		System.out.println(count);
	}

}
