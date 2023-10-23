package Program;

public class Program8 {

	public static void main(String[] args) {
		int currentRow = 1;
		int counter = 1;

		// Create a new Scanner object
		// Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = 5;

		System.out.println("** Printing the pattern... **");
		for (int i = 1; i <= rows; i++) {
			if (i % 2 == 0) {
				int reverse = currentRow + counter - 1;
				for (int j = 0; j < i; j++) {
					System.out.print(reverse-- + " ");
					counter++;
				}
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print(counter + " ");
					counter++;
				}
			}
			System.out.println();
			currentRow++;
		}
	}

}
