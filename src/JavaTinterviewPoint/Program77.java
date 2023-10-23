package JavaTinterviewPoint;

public class Program77 {

	public static void main(String[] args) {

		// int rows = scanner.nextInt();
		int k = 1;

		// System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21
