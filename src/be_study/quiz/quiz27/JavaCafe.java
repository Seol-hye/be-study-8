package be_study.quiz.quiz27;

public class JavaCafe {
	public static void main(String[] args) {
		printPay(10.00, 40); //400
		printPay(10.00, 50); //550
		printPay(7.50, 38);	 //시급에러
		printPay(8.50, 66);	 //근무시간에러
		}
		// 시급과 일한 시간을 입력받아, 주급을 출력
		// 근무시간 * 기본 시급
		//주당 근무 40시간 초과시 초과분에 대하여 1.5배 지급
		// 기본 시급 최저 $8.00 이보다 작을 경우 경고문 출력
		// 주당 근무 60시간 넘을 시 경고문 출력
		public static void printPay(double basePay, int hours) {
		double pay = basePay * hours;
		/* 해당 메소드를 완성하세요. */
		if(basePay < 8) {
			System.out.println("최저 시급 에러!");
			return;
		}
		
		if(hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return;
		} 
		
		//앞에서 잘못된 경우 필터링 통과해서 도착 -> 입력 정상 범위
		if(hours > 40) {
			pay = (40 * basePay) + (hours - 40) * basePay * 1.5;
		}
		
		//if(hours <= 40) {
		//		pay = basePay * hours;
		//} else {
		//		pay = (basePay*40) + ( (hours-40) * basePay * 1.5) );
		//}
		System.out.printf("$ %.2f\n", pay);
		}

}
