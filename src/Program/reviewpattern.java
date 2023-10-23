package Program;

public class reviewpattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 && j == 2) {
					System.out.print("*");
				} else if (i == 1 && (j == 1 || j == 3)) {
					System.out.print("*");
				} else if (i == 2 && (j == 0 || j == 2 || j == 4)) {
					System.out.print("*");
				} else if (i == 3 && (j == 1 || j == 3)) {
					System.out.print("*");
				} else if (i == 4 && j == 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
