package be_study.quiz.quiz40.q4;

/* 1. 부모 클래스 Currency를 만드시오. */
public abstract class Currency {
	/* 2. 상속을 통해 중복 코드를 제거 후, */
	
	//private 상속 X
	public double amount; // 수량(1000)
	protected String notation; // 표기법
	
	/* 3. 생성자를 올바르게 수정하시오. */
	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	/* 4. toString() 메소드를 오버라이딩 하시오. */
	public abstract String toString();
	
//	public String toString() {
//		return String.format("%s %.2f%s", getClass().getSimpleName(), amount, notation);
//	}
}
