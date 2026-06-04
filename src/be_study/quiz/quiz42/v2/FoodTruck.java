package be_study.quiz.quiz42.v2;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck {
	
	List<Food> menuList;
	int sales; // 총매출액
	
	FoodTruck(){
		menuList = new ArrayList<>();
	}
	
	//메뉴 추가
	void addMenu(String name, int price) {
		Food food = new Food(name, price);
		menuList.add(food);
	}
	
	//메뉴 보여주기
	void showMenu() {
		for(int i=0; i<menuList.size(); i++) {
	        System.out.printf("[%d] ", i + 1);
	        menuList.get(i).showFoodInfo();
	        System.out.println();
		}
	}
	
	//주문하기
	public void order(int menuNum, int count) {
		
		Food food = menuList.get(menuNum - 1);

		if (food.sell(count)) {
			sales += food.price * count;
		} else {
			System.out.println("재고 부족");
		}
		
	}
	
	//
	public int getMenuCount() {
	    return menuList.size();
	}
	
	//재고 추가
	void addStock(int menuNum, int count) {
	    menuList.get(menuNum - 1).addStock(count);
	}
	
	public Food getFood(int menuNum) {
	    return menuList.get(menuNum - 1);
	}
	
	//마감
	public void close() {
		int cost = 0;

		for (Food f : menuList) {
			cost += (int) (f.price * 0.3 * f.stock);
		}

		int profit = sales - cost;
		
		System.out.printf(">>> 총매출액 : %d 원\n", sales);
		System.out.printf(">>> 원가차감 : %d 원\n", cost);
		System.out.printf(">>> 최종수익 : %d 원\n", profit);
		
	}
	
}
