package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		
//		for(int i=3; i>=1; i--) {
//			
//			for(int j=3; j>=1; j--) {
//				System.out.print((i+j) + " ");
//			}
//			System.out.println();
//		}
//		
//		int[][] arr = new int[3][3];
//
//		for(int i=0; i<arr.length; i++) {
//			
//			for(int j=0; j<arr[i].length; j++) {
//				if(i>j) {
//					arr[i][j] = 1;
//				}
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		} 
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = { "입력", "수정", "조회", "삭제", "종료" };
		
		int menu = 0;
		
		while(menu != 5) {
			
			//메뉴표시
			for(int i=0; i<arr.length; i++) {
				//index i: 0 1 2 3 4 
				// 순번	 : 1 2 3 4 5
				//System.out.println((i+1) + ". " + arr[i]);
				System.out.printf("%d. %s\n", (i+1), arr[i]);
			}
		    //System.out.printf("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n5. 종료\n");
			
			//메뉴입력
			System.out.print("메뉴 번호를 입력하세요 : ");
		    menu = scanner.nextInt();

		    if(menu == 5) {
		        System.out.println("프로그램이 종료됩니다.");
		    } else if(menu >= 1 && menu <= 4) {
		        System.out.println(arr[menu - 1] + " 메뉴입니다.");
		    } else {
		    	System.out.println("잘못 입력하셨습니다.");
		    }
		}
		
//		while(num != 5) {
//
//		    System.out.println("1. 입력");
//		    System.out.println("2. 수정");
//		    System.out.println("3. 조회");
//		    System.out.println("4. 삭제");
//		    System.out.println("5. 종료");
//
//		    System.out.print("메뉴 번호 입력 : ");
//		    num = scanner.nextInt();
//
//		    switch(num) {
//
//		        case 1:
//		        case 2:
//		        case 3:
//		        case 4:
//		            System.out.println(arr[num - 1] + " 메뉴입니다.");
//		            break;
//
//		        case 5:
//		            System.out.println(arr[num - 1]);
//		            break;
//
//		        default:
//		            System.out.println("잘못 입력했습니다.");
//		    }
//		}
		
	}

}
