package be_study.quiz.quiz24;

public class Person { //사람 클래스
	
	//필드
	String name; //이름
	String gender; //성별
	int age; //나이
	double height; //키
	double weight; //몸무게
	String job; //직업
	String bloodType; //혈액형
	String health; //건강상태 -> boolean isHealthy 로도 가능
	//매우좋음 좋음 보통 나쁨 매우나쁨
	//static final 상수형, enum
	//int ... 1 ~ 10 	10이 제일 건강
	boolean isSleeping; //수면중여부
	
	//생성자
	Person(){ //기본생성자
	}
	
	Person(String name, int age, double height, boolean isSleeping){
		this.name = name;
		this.age = age;
		this.height = height;
		this.isSleeping = isSleeping;
	}

}
