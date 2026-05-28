package be_study.quiz.quiz34;

import java.util.ArrayList;

public class Kitchen { //주방공간
	
	int area; //몇평
	String wallColor; //벽지 색상
	int floorHeight; //층고 -> 단위 	2.5m  250cm  2500mm
	
	//주방에 냉장고 / 가스레인지 / 싱크대
	Refrigerator refrigerator;
	GasRange gasRange;
	Sink sink;
	
	//TrashCan trashCan; // 주방에 쓰레기통 한개
	//TrashCan[] trashCan;
	ArrayList<TrashCan> trashCanList; //주방에 쓰레기통 여러개
	
	ArrayList<Cup> cupList; //주방에 컵이 여러개
	
	Kitchen() {
		cupList = new ArrayList<>();
		trashCanList = new ArrayList<>();
	}
	
	public void addCup(Cup cup) {
		cupList.add(cup);
	}
	
	public void addTrashCan(TrashCan trashCan) {
		trashCanList.add(trashCan);
	}
	
	
}
