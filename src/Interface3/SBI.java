package Interface3;

public class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.7f;
	}

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}

}
