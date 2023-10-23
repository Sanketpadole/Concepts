package Super_subclass;

public class Animal {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Animal d = new Animal("dshfeagi", 44);
		System.out.println(d.getAge() + "name" + d.getName());
	}

}