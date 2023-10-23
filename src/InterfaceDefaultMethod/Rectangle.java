package InterfaceDefaultMethod;

class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}

	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}

//Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:
