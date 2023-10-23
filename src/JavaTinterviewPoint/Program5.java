package JavaTinterviewPoint;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

//5
//5 4
//5 4 3
//5 4 3 2
//5 4 3 2 1
