package be_study.quiz.quiz34;

public class TrashCan {
	
	int liter; // 최대용량 20L  50L
	String color;
	boolean isFull;
	
	int trachPercentage; //몇% 찼는가?
	
	boolean isLidOpend;
	
	//쓰레기통을 연다
	public void openLid() {
		isLidOpend = true;
	}
	
	//쓰레기통을 닫는다
	public void closeLid() {
		isLidOpend = false;
	}
	

	void setTrachPercentage(int trachPercentage) { // 30% 40%
		this.trachPercentage = trachPercentage;
	}
	
	void insertTrash(int addPercentage) { // +10%
		trachPercentage += addPercentage;
	}
	
	// 리터단위 추가  5L  3L
	void insertTrashLiter(int trashLiter) {
		
		// (현재 리터 + trashLiter) / Liter -> 0.3  0.5  0.05
		// 계산결과 -> %단위로 변환
		// 0.3 * 100 = 30%
		// (10L + 5L) / 50L = 0.3 * 100 -> 30%
	}
	
	//쓰레기통을 비운다
	void cleanTrash() {
		this.trachPercentage = 0; //쓰레기 비워서 채워진 용량이 0
	}

	public void fillTrash() {}
	
	
	public void emptyTrash() {}

}
