package JavaTinterviewPoint;

public class Program55 {

	public static void main(String[] args) {
		for (int i = 6; i >= 1; i--) {
			for (int j = 6; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//6
//6 5
//6 5 4
//6 5 4 3
//6 5 4 3 2
//6 5 4 3 2 1
