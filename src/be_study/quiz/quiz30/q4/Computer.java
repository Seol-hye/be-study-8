package be_study.quiz.quiz30.q4;

public class Computer {
	
	
	//public String[] osType
	//public static String[] osType 		공통으로 사용
	//public final String[] osType 			값 변경 XXX
	
	//상수형 변수		코드 기준		대문자 + _언더바(구분)
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};

	
	int index; // 01 2 3 osType에 사용할 인덱스
	int memory; // 16 32 16 메인메모리 값
	
	String os; //운영체제 문자열
	
	public Computer(int index, int memory) {
		this.index = index;
		this.memory = memory;
		
		this.os = OS_TYPE[index];
	}
	
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n", OS_TYPE[index], memory);
		System.out.printf("운영체제: %s, 메인메모리: %d\n", os, memory);
	}

}
