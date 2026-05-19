package be_study.quiz;

import java.util.Scanner;

public class Quiz23_lv1 {

public static void main(String[] args) {
		
		/*
		
		- 레벨 1
		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
		
		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
		
		*/
		
		boolean isBroken = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("탑승 인원 : ");
		int personCount = scanner.nextInt(); //탈 사람 수
		int[] destFloorArr = new int[personCount]; //사람 수만큼 배열, 내리는 층수 배열
		
		int stairs = destFloorArr.length; //계단 이용해야할 승객
		
		System.out.print("몇 층에서 내릴지 입력 : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
		}
		
		//level1 추가
		System.out.print("엘리베이터 멈출 수 있는 최대 횟수 입력 : ");
		int maxCount = scanner.nextInt(); //최대 정차 횟수
		
		int stopCount = 0; //정차 횟수
		
		//1층 -> 100층으로 올라가면서 사람들 하차
		for(int i=1; i<=100; i++) { //현재 층
			int count = 0;
			System.out.println("현재 " + i + "층");
			for(int j=0; j<destFloorArr.length; j++) { //사람번호
			
				if(i == destFloorArr[j]) {
					count++;
				}
			}
			if(count > 0) {
				stopCount++; //정차 횟수 증가
				System.out.printf("-> 도착! %d명 하차 \n", count);
				stairs -= count; //정차해서 내린 사람 빼고 남은 승객 수
				
				if(stopCount == maxCount) { //마지막 정차
					isBroken = true;
					System.out.printf("-> 현재 %d층 점검중 \n", i);
					
					System.out.printf("-> 남은 승객 %d명은 계단 이동\n", stairs);
					break;
				}
			}
		}
		
		//100층 -> 1층으로 내려오기
		if(isBroken == false) {
			for(int i=99; i>=1; i--) {
				System.out.println("현재 " + i + "층");
			}
		}
		

	}

}

