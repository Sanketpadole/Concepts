package InterfaceStaticMethod;

public class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}

	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
	}

}

//
//Since Java 8, we can have static method in interface. Let's see an example:
