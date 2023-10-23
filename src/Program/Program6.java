package Program;

public class Program6 {

	public static void main(String[] args) {
		// Create a new Scanner object
		/// Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = 5;

		System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2);
			}

			System.out.println();
		}
	}

}

//1
//1 0
//1 0 1
//1 0 1 0
//1 0 1 0 1
