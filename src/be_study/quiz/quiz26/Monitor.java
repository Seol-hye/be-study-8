package be_study.quiz.quiz26;

public class Monitor {
	
	//필드
	String brand; //제조회사
	int inch; //인치
	int price; //가격
	String color; //색상
	int xMax; //최대해상도x
	int yMax; //최대해상도y

	Monitor(){}
	
	Monitor(String brand, int inch, int price) {
		this.brand = brand;
		this.inch = inch;
		this.price = price;
	}
	
	//메소드
	//매개변수 전달 -> 필듣변수 저장
	void setXY(int x, int y) {
		this.xMax = x;
		this.yMax = y;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int priceUp(int sum) {
		price += sum; //금액 인상 -> 저장
		return price; //인상된 최종 금액 반환
	}
	
	void printInfo() {
		System.out.println("=====================");
		System.out.printf("%s %d인치 %d %s\n", brand, inch, price, color);
		System.out.printf("해상도 : %d * %d\n", xMax, yMax);
	}

}
