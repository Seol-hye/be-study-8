package be_study.quiz.quiz42.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruckMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		FoodTruck ft = new FoodTruck();
		
		//메뉴 추가
		ft.addMenu("김밥", 4000);
		ft.addMenu("떡볶이", 6000);
		ft.addMenu("순대", 7000);

		// 기본재고
		ft.addStock(1, 6);
		ft.addStock(2, 6);
		ft.addStock(3, 6);

		boolean run = true;
		while (run) {

			System.out.println("******[메뉴선택]******");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			int choiceNum = scanner.nextInt();
			System.out.println();

			switch (choiceNum) {

			case 1: // 메뉴보기
				System.out.println("-----------메뉴------------");

				ft.showMenu();
				
				System.out.println();
				break;

			case 2: {// 주문하기

				// 메뉴출력
				System.out.println("-----------메뉴------------");
				ft.showMenu();

				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int menuNum = scanner.nextInt(); // 메뉴 번호 선택
				
			//									3	
				if(menuNum < 1 || menuNum > ft.getMenuCount()) { 
					System.out.println("잘못 입력!");
					break;
				}

				System.out.print(">>> 주문 수량 입력 : ");
				int count = scanner.nextInt(); // 주문 수량
				
				ft.order(menuNum, count);
				break;
			}

			case 3: {// 재고관리
				System.out.println("-----------메뉴------------");
				ft.showMenu();

				System.out.println("========[재고선택]========");
				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int menuNum = scanner.nextInt(); // 메뉴 번호 선택
				
				if(menuNum < 1 || menuNum > ft.getMenuCount()) { 
					System.out.println("잘못 입력!");
					break;
				}

				System.out.print(">>> 재고 조정할 개수 입력 : ");
				int count = scanner.nextInt(); // 주문 수량

				ft.addStock(menuNum, count);

				System.out.println("[재고 조정 적용]");
				ft.getFood(menuNum).showFoodInfo();

				System.out.println();
				break;
			}

			case 4: // 마감하기
				System.out.println("========[영업마감]========");
				System.out.println("--------[마감정보]--------");

				ft.close();
				
				run = false;
				break;

			default:
				System.out.println("잘못 입력! 다시 입력하세요!");

			}

		}

	}
}
