package be_study.quiz.quiz38.v2;

//class Unit
//abstract class Unit
//interface Unit ??? -> 필드변수X, 재정의하는 메소드 선언

public abstract class Unit {
	//추상클래스화
	// Unit 이라는 객체를 생성하면 어색

	int x, y;

	//추상메소드
	abstract void move(int x, int y); // 지정된 위치로 이동
	//직접 정의 X
	//재정의 강제
	//다형성을 위해서 부모클래스쪽에 사용법 인지를 위해 선언
	
	void stop() {
		System.out.println("현재 위치에 정지."); } // 현재 위치에 정지

	//인터페이스 버전 경우 -> 기본작동 메소드 정의
	//default void stop() {}
}