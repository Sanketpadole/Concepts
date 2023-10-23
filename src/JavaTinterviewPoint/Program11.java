package JavaTinterviewPoint;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}

//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
