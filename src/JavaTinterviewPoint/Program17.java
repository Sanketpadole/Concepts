package JavaTinterviewPoint;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();
		System.out.println("** Printing the pattern... **");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(1 + j * rows - (j - 1) * j / 2 + i - j + " ");
				} else {
					System.out.print(1 + j * rows - (j - 1) * j / 2 + rows - 1 - i + " ");
				}
			}

			System.out.println();
		}
	}

}

//
//1
//2 9
//3 8 10
//4 7 11 14
//5 6 12 13 15
