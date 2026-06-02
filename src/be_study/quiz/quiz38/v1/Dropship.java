package be_study.quiz.quiz38.v1;

public class Dropship extends Unit { // 수송선
//	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("[수송선] 지정된 위치로 날아서 이동."); } // 지정된 위치로 이동

//	void stop() {
//		/* */ } // 현재 위치에 정지

	void load() {
		System.out.println("[수송선] 선택된 대상을 태움."); } // 선택된 대상을 태운다

	void unload() {
		System.out.println("[수송선] 선택된 대상을 내림."); } // 선택된 대상을 내린다
}
