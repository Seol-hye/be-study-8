package be_study.quiz.quiz40.q2;

public class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		return (int) (price * 0.7);
	}
}