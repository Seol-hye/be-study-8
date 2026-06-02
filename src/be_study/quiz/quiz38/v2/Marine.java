package be_study.quiz.quiz38.v2;

public class Marine extends Unit { // 보병
//	int x, y; // 현재 위치
//
	void move(int x, int y) {
		System.out.println("[보병] 지정된 위치로 걸어서 이동."); } // 지정된 위치로 이동

//	void stop() {
//		/* */ } // 현재 위치에 정지

	void stimPack() {
		System.out.println("[보병] 스팀팩을 사용.");} // 스팀팩을 사용한다
}
