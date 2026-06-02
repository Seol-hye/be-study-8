package be_study.quiz.quiz38.v2;

public class Tank extends Unit { // 탱크
//	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("[탱크] 지정된 위치로 바퀴구르기."); } // 지정된 위치로 이동

//	void stop() {
//		/* */ } // 현재 위치에 정지

	void changeMode() {
		System.out.println("[탱크] 공격모드 변환.");} // 공격모드를 변환한다
}
