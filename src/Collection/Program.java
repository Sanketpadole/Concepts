package Collection;

public class Program {

	public static void main(String[] args) {

		int arr[] = { 12, 4, 6, 81, 5, 9 };

		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] % 2 == 0 && i % 2 == 0) {
				System.out.println("even" + arr[i]);

			}

			else if (arr[i] % 2 != 0 && i % 2 != 0) {
				System.out.println("odd" + arr[i]);
			}
		}
	}

}

//
//0===12;
////1==4
//
//2==6;
//
//3==84
