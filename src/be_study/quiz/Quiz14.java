package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("자연수 5개 입력 : ");
		
		int[] arr1 = new int[5];
		
		//index 0 ~ 4		i<5
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		System.out.print("몇 번째 수인가요? ");
		int x = scanner.nextInt();
		
		//index = 입력받은 순서 - 1
		System.out.println("결과 : " + arr1[x-1]);
		
		System.out.println("======================");
		
		
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1

		System.out.print("자연수 5개 입력 : ");
		
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr2.length; i++) {	//i: 0 1 2 3 4
			arr2[i] = scanner.nextInt();
		}
		
		System.out.print("결과 : ");
		
		//반대로 출력 i: 4 3 2 1 0
		// 		i=4	;
		for(int i=arr2.length-1; i>=0; i--) { 
		    System.out.print(arr2[i] + " ");
		}
		
//		//반대로 뒤에서부터 입력 저장
//		for(int i=arr2.length-1; i>=0; i--) { 
//			arr2[i] = scanner.nextInt();
//		}
//		//출력할 때 그대로
//		for(int i=0; i<arr2.length; i++) {	//i: 0 1 2 3 4
//			 System.out.print(arr2[i] + " ");
//		}
		
		System.out.println("======================");
		
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
		
		int[][] arr3 = new int[4][4];
		
		//값 저장
		int num = 1;
		
		for(int i=0; i<arr3.length; i++) {
			
			for(int j=0; j<arr3[i].length; j++) {
				
				// i : 0			1		  2			3
				// j : 0 1 2 3	0 1 2 3	  0 1 2 3	0 1 2 3
				// 값 : 1 2 3 4  5 6 ...... 			  14 15 16
				
				//별도의 저장용 값을 사용 +1 증가시키면서
				arr3[i][j] = num;
		        num++; //n = n + 1;		n += 1;
		        
		        // i j를 활용하여 수식 형태  (i*4) + (j+1)
				System.out.print(arr3[i][j] + " ");

			}
			System.out.println();
		}
	}

}
