package be_study.quiz.quiz40.q4;

public class JPY extends Currency {
//	private double amount;
//	private String notation;

	public JPY(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("JPY %.2f%s", amount, notation);
	}

}
