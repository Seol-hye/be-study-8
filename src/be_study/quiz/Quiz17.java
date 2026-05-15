package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)

		int x, y;
		//		 2*x<10
		for(x=1; x<=10; x++) {
			//		4*y<10
			for(y=1; y<=10; y++) {
				
//				if((2*x) + (4*y) > 10 ) {
//				break;
//			}
	
				if( (2*x) + (4*y)==10 ) {
					System.out.println("x:" + x + " y:" + y);
				}
			}
		}
		
		
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수

		System.out.println("=======================");
		
		System.out.print("정수 2개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1>=num2) {
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		} else if(num1<num2) {
			System.out.printf("%d - %d = %d\n", num2, num1, num2-num1);
		}
			
			
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		int[] arr = new int[4];
		int count = 0;
		
		System.out.println("=======================");
		
		System.out.print("4개의 윷 입력 : ");
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 1)
				count++;
		}
		
//		for(int i=0; i<4; i++) {
//			count = count + scanner.nextInt();
//		}
		
		if(count==1) {
			System.out.println("결과 : 도");
		} else if(count==2) {
			System.out.println("결과 : 개");
		} else if(count==3) {
			System.out.println("결과 : 걸");
		} else if(count==4) {
			System.out.println("결과 : 윷");
		} else if(count==0) {
			System.out.println("결과 : 모");
		}
		
//		String[] yutText = {"모", "도", "개", "걸", "윷"};
//		System.out.println(yutText[count]);
		
		

			
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		System.out.println("=======================");
		
		System.out.print("출력할 숫자 입력 : ");
		int num4 = scanner.nextInt();
		
		for(int i=1; i<=num4; i++) {
			System.out.print("*");
		}	
			
		

	}

}
