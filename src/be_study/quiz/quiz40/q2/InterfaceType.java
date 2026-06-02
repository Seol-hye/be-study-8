package be_study.quiz.quiz40.q2;

import java.util.ArrayList;
import java.util.List;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
		//객체 생성
		Food food = new Food("족발", 19800);
		Electronics elec = new Electronics("에어팟", 199000);
		Clothing cloth  = new Clothing("셔츠", 49900);
		
		//총합 계산
		
		//배열
//		Orderable[] orderableThings = { food, elec, cloth };
//
//		int total = 0;
//		for (int i = 0; i < orderableThings.length; i++) {
//			Orderable temp = orderableThings[i];
//			total += temp.discountedPrice();
//		}
		
		//리스트
		List<Orderable> orderList = new ArrayList<>();
		orderList.add(new Food("족발", 19800));
		orderList.add(new Electronics("에어팟", 199000));
		orderList.add(new Clothing("셔츠", 49900));
		
		int total = 0;
		
		for(Orderable o: orderList) {
			total += o.discountedPrice();
		}
		
//		int sum = food.discountedPrice() + elec.discountedPrice() + cloth.discountedPrice();
//		System.out.println(sum);
		
		//결과 출력
		System.out.printf("총합: %d\n", total);
	}
}
