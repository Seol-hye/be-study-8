package be_study.quiz.quiz40.q4;

public class EUR extends Currency {
//	private double amount;
//	private String notation;

	public EUR(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("EUR %.2f%s", amount, notation);
	}

}
