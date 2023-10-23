package Program;

public class Program5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int temp;
			temp = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(temp);
				temp += 7;
			}
			System.out.println();
		}
	}

}

//1
//2 9
//3 10 17
//4 11 18 25
//5 12 19 26 33