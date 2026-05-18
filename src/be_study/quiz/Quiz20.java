package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 
		 로직/흐름/처리
		 
		 조건 -> 처리
		 언제까지
		 
		 -메뉴 뭐 시켰는가? -> 어떻게 관리 -> 어디에 저장
		 -메뉴 뭐를 몇개 시켰나? (단일 갯수만 관리 -> 각 메뉴별 갯수 관리)
		 -메뉴 금액 얼마인가? 4000 4500 ...
		 -메뉴 여러개 뭐가 있나? (메뉴명/메뉴가격/메뉴주문갯수)
		 
		 시작.
		 메뉴 보여주기.
		 		-> 메뉴관리
		 		-> 어떻게 보여줄까?
		 		
		 메뉴 선택 입력받기 (주문받기)
		 		-> 단순 입력
		 		-> 잘못 입력된 경우 대처
		 		
		 주문 수량 입력받기 (몇개 시킬지)
		 		-> 단순 입력
		 		-> 잘못 입력된 경우 대처
		 		
		 추가 주문 여부 체크 (y/n)
		 		-> 추가 주문 y -> 다시 메뉴 보여주기부터 반복
		 		-> 추가 주문 n -> 메뉴 수량 금액 보여주고 -> 끝내기
		 
		 주문 메뉴별 수량 + 가격
		 주문 총금액 보여주기
		 
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼", "카푸치노" }; //메뉴이름
		int[] priceArr= {3500, 4100, 4300, 4600}; //메뉴가격
		int[] countArr = new int[menuArr.length]; //메뉴주문수량
		
		int menu; //메뉴선택입력
		int count; //수량입력	
		
		String addOrder = "";
		int i = 0;
		while(true) {
			
			while(true) {
				
				//메뉴표시
				System.out.println("========= 메뉴 =========");
				for(i=0; i<menuArr.length; i++) {
					System.out.printf("%d. %-8s	%6d원\n", (i+1), menuArr[i], priceArr[i]);
				}
				System.out.println("=======================");
				
				//입력
				System.out.print("메뉴 선택 : ");
			    menu = scanner.nextInt();
			    
			    if (menu >=1 && menu<=menuArr.length) { //정상범위선택
			    	break;
			    } else {
			    	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		    		continue;
			    }
				
			}
			
		    System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			countArr[menu-1] += count; //선택한 메뉴번호-1 위치 인덱스에 수량 추가
			   
			scanner.nextLine(); //기존 입력값 엔터 청소용
			    
			//끝나면? 주문금액 내역 출력 끝
			    
			while(true) { // y/n 제대로 입력할 때까지 계속 시킴
			   System.out.print("추가 주문하시겠습니까?(y/n) : ");
			   addOrder = scanner.nextLine();
				    
			   //y 나 n 으로 입력했는가?
			   if(addOrder.equals("n") || addOrder.equals("y") ) {
				   break;
			   } else {
				   System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			   }
			}
			    
			//if ... y -> 계속 진행
			//if ... n -> 종료 -> 최종내역금액출력
			    
			    
			if(addOrder.equals("n")) {
			    int total = 0;
			    	
			    //최종 수량 금액 보여주고 종료
			    System.out.println("=======================");
			    for(i=0; i<menuArr.length; i++) {
			    	if(countArr[i]>0) {
			    		System.out.printf("%s %d잔 :	%d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
			    		total = total + countArr[i]*priceArr[i];
			    	}
						
				}
			    	
			    System.out.println("=======================");
			    System.out.println("총액 : " + total + "원");
			    break;
				}
			} 

	}

}
