package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz23_lv2 {

	public static void main(String[] args) {
		
		/*
		
		- 레벨 2
		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
		
		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
		
		
		
		*/
		
		boolean isBroken = false;
		
		Scanner scanner = new Scanner(System.in);
		
		int personCount = (int)(Math.random()*20) + 1; //20명까지 대기중
		System.out.println("탑승대기인원 : " + personCount);
		
		int[] destFloorArr = new int[personCount]; //사람 수만큼 배열, 내리는 층수 배열
		
		System.out.print("몇 층에서 내릴지 입력 : ");
		for(int i=0; i<destFloorArr.length; i++) {
			//destFloorArr[i] = scanner.nextInt();
			destFloorArr[i] = (int)(Math.random()*99) + 2; //2~100
			//중복제거 로직
			System.out.print(destFloorArr[i] + " ");
		}
		System.out.println();
		
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
				//stairs -= count; //정차해서 내린 사람 빼고 남은 승객 수
				
				if(stopCount == maxCount) { //마지막 정차
					isBroken = true;
					System.out.printf("-> 현재 %d층 점검중 \n", i);
					
					//System.out.printf("-> 남은 승객 %d명은 계단 이동\n", stairs);
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
