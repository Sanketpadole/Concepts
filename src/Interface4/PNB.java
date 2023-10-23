package Interface4;

class PNB implements Bank {

	@Override
	public float rateOfInterest() {

		return 11.7f;
	}

	public static void main(String[] args) {
		SBI pnb = new SBI();
		System.out.println(pnb.rateOfInterest());
	}

}
