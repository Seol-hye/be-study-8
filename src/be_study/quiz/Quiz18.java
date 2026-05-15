package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
			첫i반복문	라인(행)수 1 2 3 4 5		5회 반복
		    j반복문	라인(행)수 5 4 3 2 1		5회 4회 3회 ... 1회
		*/

		int i, j;
		
		for(i=0; i<5; i++) { //i=1; i<=5
			for(j=0; j<5-i; j++) {	//j=1; j<=6-i -> 5 4 3 2 1
				System.out.print("*");
			}
			System.out.println();	
		}

		
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		
		*/
		
		System.out.println("=======================");

		for(i=1; i<=5; i++) {
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		System.out.println("=======================");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = scanner.nextInt();
		
		for(i=1; i<=num1; i++) {
			if(num1 % i == 0)
			{
				System.out.print(i + " ");
			}
		} System.out.println();	
//		
		
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		System.out.println("=======================");
		
		System.out.print("입력 : ");
		int num2 = scanner.nextInt();
		
		for(i=1; i<=num2; i++) {
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=num2-1; i>=1; i--) {
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}


//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		System.out.println("=======================");
		int sum = 0;
		for(i=1; i<=10; i++){
			for(j=1; j<=i; j++) {
				sum = sum + j;
			}
		} System.out.println(sum);
		
		sum = 0;
		int currentSum = 0;
		for(i=1; i<=10; i++) {
			//i: 1 -> 2 -> 3
			//currentSum = 0 -> 1 -> 3 -> 6
			//sum: 0 -> 1 -> 4 -> 10
			currentSum = currentSum + i; // 0+1		1+2 	3+3
			sum = sum + currentSum;  // 0+1		1+3		4+6
		} System.out.println(sum);
		
		sum = 0;
		for(i=1; i<=10; i++) {
			sum = sum + (i*(10-(i-1)));
		} System.out.println(sum);
		
		
		
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		System.out.println("=======================");
		sum = 0;
		
		i = 0;
		while(true) {

			if(i%2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			if(sum >= 100) {
				break;
			}
			i++;
		} System.out.printf("%d \n%d", sum, i);
		
	}

}
