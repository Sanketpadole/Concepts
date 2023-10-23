package Super_subclass;

public class X {
	int age;
	String name;
}

	public X(int age, String name) {
		this.age = age;
		this.name = name;
	}
//X x=new X(12,"sanket");

}

class Y {
	String topic;
}

	public Y(String topic) {
		this.topic = topic;
	}

	Y y = new Y("oops");
}
