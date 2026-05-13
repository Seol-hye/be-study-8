package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = scanner.nextInt();
		
		if( a%2==0 ) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		

//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		System.out.println("=======================");
		
		System.out.print("정수 입력 : ");
		int b = scanner.nextInt();
		
		if( b%7==0 ) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		System.out.println("=======================");
		int sum = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%5==0) {
				sum += i;
			}
		} System.out.println("5의 배수 합: " + sum);
		
		//for(int i=1; i<=1000; i++) {
		//		if(i%5 != 0) {
		//			continue; }
		//		sum = sum + i;
		
		//for(int i=5; i<=1000; i+=5) {
		//		sum += i;}
		

//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********

		System.out.println("=======================");
		
		System.out.print("1 ~ 50까지의 수 입력 : ");
		int c = scanner.nextInt();
		
		System.out.print("결과 : ");
		for(int i=1; i<=c; i++) {
			if(c>50)
				break;
			System.out.print("*");
		}
		
		System.out.println();
		
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		
		System.out.println("=======================");
		int i, x = 0;

		for(i=1; i<=10; i++) {
			if(i%2 != 0) {
				x += i;
			} else {
				x -= i;
			}
		} System.out.println(x);
		
		//x = x + (i%2==0 ? -i : i);
		
		
//		6. 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다.
//		이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		System.out.println("=======================");
		int sum6 = 0;
		for(i=1; i<=1000; i++) {
			sum6 += i;
			if(sum6>1000)
				break;
		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
		
//		sum6 = 0;
//		for(i=1; i<=1000; i++) {
//			if(sum6<=1000){
//				sum6 += i;
//			} else
//				break;
//		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
		
//		sum6 = 0;
//		for(i=1; true; i++) {
//			sum6 += i;
//			if(sum6>1000)
//				break;
//		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
//		
//		sum6 = 0;
//		for(i=1; sum < 1000; i++) {
//			sum6 += i;
//		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
		
//		i = 0;
//		while(sum6 < 1000) {
//			sum6 += i;
//			i += 1;
//		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
		
//		i = 1;
//		while(true) {
//			sum6 += i;
//			i += 1;
//			
//			if(sum6 >= 1000) {
//				break;
//			}
//		} System.out.println("1000이 넘어간 시점의 누적 합 : " + sum6);
	
		
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
		System.out.println("=======================");
		
		System.out.print("1 ~ 9까지 입력 : ");
		int z = scanner.nextInt();

		for(i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", z, i, z*i);
		} 

	}

}
