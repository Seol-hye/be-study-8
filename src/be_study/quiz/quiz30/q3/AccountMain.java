package be_study.quiz.quiz30.q3;

public class AccountMain {

	public static void main(String[] args) {
		
		//클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		//출하려는 메소드를 호출하여 출력
		Account a2 = new Account();
		
		a2.setOwner("이민호");
		a2.setBalance(16000);
		
		System.out.println(a2.getOwner() + " " + a2.getBalance());
		
		a2.deposit(5000);
		System.out.println("현재 잔액: " + a2.getBalance());
		
		a2.withdraw(3000);
		System.out.println("현재 잔액: " + a2.getBalance());
		
		a2.withdraw(20000);
		System.out.println("현재 잔액: " + a2.getBalance());

	}

}
