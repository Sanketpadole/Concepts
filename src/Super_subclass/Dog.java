package Super_subclass;

public class Dog {
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "is eating");
	}

	public void sleep() {
		System.out.println(name + "is sleeping");
	}

	public static void main(String[] args) {
		Dog d = new Dog("hhh", 12);

	}

	class Dog extends Animal {
		private String breed;

		public Dog(String breed) {
			super(name, age);
			this.breed = breed;
		}

		public void bark() {
			System.out.println(name + "is barking");
		}

	}
}

//public class Animal {
//	private String name;
//	private int age;
//
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public void eat() {
//		System.out.println(name + " is eating.");
//	}
//
//	public void sleep() {
//		System.out.println(name + " is sleeping.");
//	}
//}
//
//class Dog extends Animal {
//	private String breed;
//
//	public Dog(String name, int age, String breed) {
//		super(name, age);
//		this.breed = breed;
//	}
//
//	public void bark() {
//		System.out.println(breed + " is barking.");
//	}
//
//	public static void main(String[] args) {
//		Dog d = new Dog("hhjj", 12, "breead");
//
//	}
