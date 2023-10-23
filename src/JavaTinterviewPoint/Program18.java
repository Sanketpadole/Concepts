package JavaTinterviewPoint;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");
		for (int i = 1; i <= rows; i++) {
			int a = 0;
			int b = 1;

			for (int j = 1; j <= i; j++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
			System.out.println();
		}
	}

}

//
//1
//1 2
//1 2 3
//1 2 3 5
//1 2 3 5 8
