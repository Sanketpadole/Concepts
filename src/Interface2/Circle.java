package Interface2;

class Circle implements Drawable {
	@Override
	public void draw() {
		System.out.println("drawing circle");
	}

// Using interface: by third user

	public static void main(String args[]) {
		Circle d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();

		Rectangle R = new Rectangle();
		R.draw();
	}

}