package Program;

public class Program22 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(Math.pow(j, i));
			}
			System.out.println();
		}
	}

}

//1
//14
//1827
//11681256
//13224310243125