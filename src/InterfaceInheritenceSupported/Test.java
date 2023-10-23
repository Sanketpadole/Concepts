package InterfaceInheritenceSupported;

class Test implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Test obj = new Test();
		obj.print();
	}

}

//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity.
//However, it is supported in case of an interface because there is no ambiguity.
//It is because its implementation is provided by the implementation class. For example:

//As you can see in the above example, Printable and Showable interface have same methods but
//its implementation is provided by class TestTnterface1, so there is no ambiguity.
