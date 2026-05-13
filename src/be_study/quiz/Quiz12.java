package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		if( year%4==0 && year%100!=0 || year%400==0 ) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		if( year%400 == 0 ) {
			System.out.println(year + "년은 윤년입니다.");
		} else if( year%100 == 0) {
			System.out.println(year + "년은 윤년이 아닙니다.");
		} else if( year%4 == 0 ) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		
		
		
		
	}

}
