package be_study.quiz.quiz30.q3;

public class Account {
	
	/*
	 3. 다음을 만족하는 클래스 Account를 작성하시오.
		
		· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
		저축과 인출을 수행한 후 잔금을 출력
		메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		출하려는 메소드를 호출하여 출력

	 */
	//· 다음의 2 개의 필드를 선언
	private String owner;
	private long balance; //잔액
	
	//· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	public Account(){
		owner = null;
		balance = 0;
	}
	
	public Account(String owner){
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance){
		owner = null;
		this.balance = balance;
	}
	
	public Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner){
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//· 위 모든 필드에 대한 getter와 setter의 구현
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public long getBalance() {
		return balance;
	}
	
	//인자인 금액을 저축하는 메소드
	public long deposit(long amount) {
		this.balance += amount; //계좌 잔액을 입금한 금액(amount)만큼 증가
	
		return balance; //입금 후 최종 잔액 반환
		
		//기존잔액 : 3만원 	입금 : 1만원
		//1) 입금한 금액 : 1만원		계좌.getBalance()
		//2) 입금후 잔액 : 4만원	<-- 계좌.deposit(10000);
	}
	
	//인자인 금액을 인출하는 메소드
	public long withdraw(long amount) {
		//잔액 이상 출금 시도시
		if( balance < amount ) {
			System.out.println("잔액부족");
			return balance;
		}
		balance -= amount;
		return balance;
		
	}
	
	//·Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
	//저축과 인출을 수행한 후 잔금을 출력
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.owner = "홍길동";
		a1.balance = 10000;
		
		System.out.println(a1.owner + " " + a1.balance);
		
		a1.deposit(5000);
		System.out.println("잔액: " + a1.balance);
		
		a1.withdraw(3000);
		System.out.println("잔액: " + a1.balance);
	
	}
	

}
