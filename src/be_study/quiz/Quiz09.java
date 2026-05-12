package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		int i = 0;

		//1. i가 0~10으로 11번 반복
		for(i=0; i<=10; i++) {
			
			//System.out.print(i + " ");
			System.out.printf("%3d", i);
		}
		
		//1-while
		System.out.println();
		i = 0;
		while(i<=10) {
			System.out.printf("%3d", i);
			i++;
		}
		
		System.out.println();
		
		//2. i가 1~9로 9번 반복
		for(i=1; i<=9; i++) {
			System.out.printf("%3d", i);
		}
		
		//2-while
		System.out.println();
		i = 1;
		while(i<=9) {
			System.out.printf("%3d", i);
			i++;
		}
		
		System.out.println();
		
		//3. i가 10 ~ 100 으로 10번 반복
		for(i=1; i<=10; i++) {
			System.out.printf("%4d", i*10);
		}
	
		//3-while
		System.out.println();
		i = 1;
		while(i<=10) {
			System.out.printf("%4d", i*10);
			i++;
		}
		
		//4. i가 25 50 75 100 해서 4번 반복
		System.out.println();
		for(i=1; i<=4; i++) {
			System.out.printf("%4d", i*25);
		}
		
		//4-while
		System.out.println();
		i = 1;
		while(i<=4) {
			System.out.printf("%4d", i*25);
			i++;
		}
	
		//5. i가 50 ~ 55로 6번 반복
		System.out.println();
		
		i = 50;
		while(i<=55) {
			System.out.printf("%3d", i);
			i++;
		}
		
//		i=50;
//		while(true) {
//			System.out.print(i + " ");
//			i++;
//			if(i>55)
//				break;
//		}
		
		//5-for
		System.out.println();
		for(i=50; i<=55; i++) {
			System.out.printf("%3d", i);
		}
		
		//6. i가 10 ~ 1로 10번 반복
		System.out.println();
		
		i = 10;
		while(i>=1) {
			System.out.printf("%3d", i);
			i--;
		}
		
		//6-for
		System.out.println();
		for(i=10; i>=1; i--) {
			System.out.printf("%3d", i);
		}
		
		//7. i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		System.out.println();
				
		i = 30;
		while(i>=0) {
			System.out.printf("%3d", i);
			i -= 5;
		}
		
		//7-for
		System.out.println();
		for(i=30; i>=0; i-=5) {
			System.out.printf("%3d", i);
		}
		
		//8. i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		System.out.println();
		
		i = 30;
		while(i>=5) {
			System.out.printf("%3d", i);
			i -= 5;
		}
		
		//8-for
		System.out.println();
		
		for(i=30; i>=5; i-=5) {
			System.out.printf("%3d", i);
		}
		
		
		//9. i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		System.out.println();
		
		i = 25;
		while(i>=0) {
			System.out.printf("%3d", i);
			i -= 5;
		}
		
		//9-for
		System.out.println();
		for(i=25; i>=0; i-=5) {
			System.out.printf("%3d", i);
		}

	}
}
