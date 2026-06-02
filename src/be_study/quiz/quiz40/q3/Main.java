package be_study.quiz.quiz40.q3;

//basecode
public class Main {
	public static void main(String[] args) {
		//객체 생성
		GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);
		//상태 출력
		System.out.println(gandalf.toString());
		//에너지볼트
		gandalf.energeVolt();
	}
}
