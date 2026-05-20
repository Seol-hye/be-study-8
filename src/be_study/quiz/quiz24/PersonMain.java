package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		
	
		Person p1 = new Person(); //인스턴스 객체 생성
		
		p1.name = "홍길동";
		System.out.println(p1.name);
		
		p1.gender = "남자";
		System.out.println(p1.gender);
		
		p1.age = 20;
		System.out.println(p1.age);
		
		p1.height = 175.2;
		System.out.println(p1.height);
		
		p1.weight = 67.5;
		System.out.println(p1.weight);
		
		p1.job = "도둑";
		System.out.println(p1.job);
		
		p1.bloodType = "A";
		System.out.println(p1.bloodType);
		
		p1.health = "건강함";
		System.out.println(p1.health);
		
		p1.isSleeping = false;
		System.out.println(p1.isSleeping);
		
		//생성자 사용
		System.out.println("----------------------");
		Person p2 = new Person("일지매", 21, 180.3, true);
		System.out.printf("%s | %d | %.1f | %s\n", p2.name, p2.age, p2.height, p2.isSleeping);
	}

}
