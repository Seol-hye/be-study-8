package be_study.quiz.quiz40.q4;

public class KRW extends Currency {
//	private double amount; // 수량(1000)
//	private String notation; // 표기법(원)

	public KRW(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("KRW %.2f%s", amount, notation);
	}
	
	
}
