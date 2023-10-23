package Program;

public class Fibonaci {
	static int a = 0;
	static int b = 1;
	static int nxt = a + b;

	Long fib(int x) {
		a = 0;
		System.out.println(a);
		b = 1;
		nxt = a + b;
		if (x > 0) {
			return fib(10);
		}
		return fib(10);

	}

	public static void main(String[] args) {

		Fibonaci fb = new Fibonaci();
		fb.fib(10);
		System.out.println(nxt);

	}

}
//0,1,1,2,3,5,8,13