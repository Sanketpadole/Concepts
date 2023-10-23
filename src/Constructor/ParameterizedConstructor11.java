package Constructor;

public class ParameterizedConstructor11 {
	int num;
	int num2;

	ParameterizedConstructor11(int num, int num2) {
		int sum = num + num2;
		System.out.println(sum);

	}

	public static void main(String[] args) {
		ParameterizedConstructor11 rr = new ParameterizedConstructor11(15, 45);

	}

}
