package be_study.quiz.quiz34;

public class GasRange {
	
	String brand; //브랜드
	int price; //가격
	int burnerCount; //버너 개수
	
	int fireLevel; // 불세기 상태
	// 불 세기 단계 0 ~ 10
	// min max 지정도 가능
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//인덕션 -> 전원켜기
	
	//불 켠다
	public void fireOn() {
		fireLevel = 5;
	}
	
	public void fireOff() {
		fireLevel = 0;
	}
	
	void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
	
	public void controlFirePower() {
		
	}
	
	

}
