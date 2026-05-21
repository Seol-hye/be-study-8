package be_study.quiz.quiz26;

public class TV {
	
	//필드
	String brand;
	int year;
	int inch;
	
	//생성자 (매개변수 3개)
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	//리턴X void, 매개변수X show()
	//메소드
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", brand, year, inch);
	}

}
