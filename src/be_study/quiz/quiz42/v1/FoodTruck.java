package be_study.quiz.quiz42.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Food> menuList = new ArrayList<>();
		
		menuList.add(new Food("김밥", 4000));
		menuList.add(new Food("떡볶이", 6000));
		menuList.add(new Food("순대", 7000));

		// 기본재고
		menuList.get(0).addStock(6);
		menuList.get(1).addStock(6);
		menuList.get(2).addStock(6);
		
		int sales = 0; // 총매출액

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

				for (int i=0; i<menuList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, menuList.get(i));
				}
				
				System.out.println();
				break;

			case 2: {// 주문하기

				// 메뉴출력
				System.out.println("-----------메뉴------------");
				for (int i=0; i<menuList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, menuList.get(i));
				}

				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int menuNum = scanner.nextInt(); // 메뉴 번호 선택
				
			//									3	
				if(menuNum < 1 || menuNum > menuList.size()) { 
					System.out.println("잘못 입력!");
					break;
				}

				System.out.print(">>> 주문 수량 입력 : ");
				int count = scanner.nextInt(); // 주문 수량

				Food food = menuList.get(menuNum - 1);

				if (food.sell(count)) {
					sales += food.price * count;
				} else {
					System.out.println("재고 부족");
				}

				break;
			}

			case 3: {// 재고관리
				System.out.println("-----------메뉴------------");
				for (int i = 0; i < menuList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, menuList.get(i));
				}

				System.out.println("========[재고선택]========");
				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int menuNum = scanner.nextInt(); // 메뉴 번호 선택
				
				if(menuNum < 1 || menuNum > menuList.size()) { 
					System.out.println("잘못 입력!");
					break;
				}

				System.out.print(">>> 재고 조정할 개수 입력 : ");
				int count = scanner.nextInt(); // 주문 수량

				Food food = menuList.get(menuNum - 1);
				food.addStock(count);

				System.out.println("[재고 조정 적용]");
				System.out.print(food);

				System.out.println();
				break;
			}

			case 4: // 마감하기
				System.out.println("========[영업마감]========");
				System.out.println("--------[마감정보]--------");

				int cost = 0;

				for (Food f : menuList) {
					cost += (int) (f.price * 0.3 * f.stock);
				}

				int profit = sales - cost;

				System.out.printf(">>> 총매출액 : %d 원\n", sales);
				System.out.printf(">>> 원가차감 : %d 원\n", cost);
				System.out.printf(">>> 최종수익 : %d 원\n", profit);

				run = false;
				break;

			default:
				System.out.println("잘못 입력! 다시 입력하세요!");

			}

		}

	}

}
