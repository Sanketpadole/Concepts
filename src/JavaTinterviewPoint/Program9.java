package JavaTinterviewPoint;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= rows; i++) {
			int temp = i;
			for (int j = i; j >= 1; j--) {
				System.out.print(temp + " ");
				temp = temp + rows;
			}
			System.out.println();
		}
	}

}

//1
//2 7
//3 8 13
//4 9 14 19
//5 10 15 20 25
