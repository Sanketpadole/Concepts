package Constructor;

public class Default {
	int num;

	Default() {
		num = 100;
	}

	Default(int num) {
		this.num = num;
	}

	public static void main(String args[]) {
		System.out.println(new Default().num);
		System.out.println(new Default(1000).num);
	}

}

//public class Default {
//	int num;
//
//	Default() {.........default
//		num = 100;
//	}
//
//	Default(int num) {............................parameterized
//		this.num = num;
//	}
//
//	public static void main(String args[]) {
//		System.out.println(new Default().num);
//		System.out.println(new Default(1000).num);
//	}
