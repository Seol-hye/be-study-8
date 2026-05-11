package be_study.quiz;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변과 높이를 입력 : ");
		double b1 = scanner.nextDouble();
		double h1 = scanner.nextDouble();
		double result1 = (b1*h1)/2;
		System.out.printf("삼각형의 넓이 = %.2f \n", result1);

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		System.out.print("윗변과 밑변과 높이를 입력 : ");
		double a2 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		double h2 = scanner.nextDouble();
		double result2 = ((a2+b2) *h2)/2;
		System.out.printf("사다리꼴의 넓이 = %.2f \n", result2);
		
		

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
		int cookie = 100;
		int student = 24;
		
		int result3 = cookie / student;
		int result3_1 = cookie % student;
		System.out.printf("한 명당 받는 과자의 수는 %d개, 남는 과자의 수는 %d개 \n", result3, result3_1);
		
		

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		System.out.print("세자리의 정수를 입력 : ");
		int num = scanner.nextInt();
		int hundred = num / 100;
        int ten = (num / 10) % 10; //(num%100)/10;
        int one = num % 10;

        System.out.println("백의 자리: " + hundred);
        System.out.println("십의 자리: " + ten);
        System.out.println("일의 자리: " + one);
		
		

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x + " y="+y);
		//x와 y를 바꾼 작업
		
		int z = x;
		x = y;
		y = z;
		System.out.println("x="+x + " y="+y);

	}

}
