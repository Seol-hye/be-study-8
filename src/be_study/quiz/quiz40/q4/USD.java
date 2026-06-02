package be_study.quiz.quiz40.q4;

public class USD extends Currency {
//	private double amount;
//	private String notation;

	public USD(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("USD %.2f%s", amount, notation);
	}

}
