package be_study.quiz.quiz30.q1;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setMajor("컴퓨터공학과");
		s1.setNum(20260527);
		
		System.out.println("학과: " + s1.getMajor());
		System.out.println("학번: " + s1.getNum());
	
	}

}
