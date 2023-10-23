package InterfaceextendsInterface;

public class Test implements showable {

	public void print() {
		System.out.println("Hello");
	}

	@Override
	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Test obj = new Test();
		obj.print();
		obj.show();
	}

}
