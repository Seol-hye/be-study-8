package be_study.quiz.quiz34;

public class Refrigerator { //냉장고
	
	String brand; //브랜드
	int liter; //리터
	boolean isPowerOn; //상태변수
	
	
	int temperature; //현재 온도(상태변수)
	//온도조절 가능한 범위 -20 ~ 10
	//지정하지 않으면 +200도 -500도가 될 가능성
	int maxTemperature; //최대온도 ->모델별로 상이
	int minTemperature; //최저온도
	
	int doorCount; //문 개수
	
	//냉동실 안에 얼음 트레이
	IceTray iceTray;
	
	
	Refrigerator(String brand, int liter) {
		this.brand = brand;
		this.liter = liter;
	}
	
	public void powerOn() {
		isPowerOn = true;
	}
	
	public void powerOff() {
		isPowerOn = false;
	}
	
	//온도 조절
	// 온도up	온도down
	// 온도세팅()
	// 온도조절(매개변수)
	
	public void temperatureUp() { //온도 1 올리기 return 없음
		temperature++;
	}
	
	public void temperatureDown() {
		temperature--;
	}
	
	
	int temperatureUp2() { //온도 1도 올리고 올린값 return
		temperature++;
		return temperature;
	}
	
	int temperatureDown2() { //온도 1도 내리고 올린값 return
		temperature--;
		return temperature;
	}
	
	boolean temperatureUp3() { //온도 1도 올리고 온도조절 성공여부 return
		
		if(temperature < maxTemperature) {
			temperature++;
			return true;
		} else { //더이상 온도를 올릴 수 없다
			return false;
		}
		
	}
	
	boolean temperatureDown3() { //온도 1도 내리고 온도조절 성공여부 return
		temperature--;
		return true;
	}
	
	//rfg.setTemprature(20) 	-15 ~ 8
	void setTemperature(int temperature) {
		if(temperature < maxTemperature)
			temperature = maxTemperature;
		
		if(temperature < minTemperature)
			temperature = minTemperature;
		
		this.temperature = temperature;
	}
	
	//한개로 매개변수 잘 넘기기
	//controlTemperature(1)	controlTemperature(2)
	//controlTemperature(3) -> 최대온도	controlTemperature(4) -> 최저온도
	void controlTemperature(int flag) {
		if(flag == 1)
			temperature++;
		else
			temperature--;
	}
	
	//controlTemperature(true)	controlTemperature(false)
	void controlTemperature(boolean isUp) {
		if(isUp)
			temperature++;
		else
			temperature--;
	}
	
	//controlTemperature2(-3)	controlTemperature2(2)
	void controlTemperature2(int change) {
		//최대 최저 온도 필터
		temperature += change;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
