package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z;
		
		System.out.println("===========1번===========");
		System.out.println("x="+x+ " y="+y);			// x=2 y=3
		System.out.println(x+y);						// 2+3 -> 5
		System.out.println(x++ + y++);					// 5
		//x:3 y:4
		System.out.println("x="+x+ " y="+y);			// x=3 y=4
		z = ++x + ++y;	// x:4 y:5	4+5=9	z:9
		System.out.println("x="+x+ " y="+y);			// x=4 y=5
		z--;		// z:8
		x += --y;	// x = x + --y; -> x:4 y:4	4+4=8	x:8 y:4 z:8 
		System.out.println("x="+x +" y="+y +" z="+z);	// x=8 y=4 z=8
		x = 10;		// x:10 y:4 z:8
		z = x/y++;	// 10/4 -> 2 x:10 y:5 z:2
		System.out.println("x="+x +" y="+y +" z="+z);	// x=10 y=5 z=2
		System.out.println("x="+(x*2) +" y="+ ++y +" z="+z); //x=20 y=6 z=2
		System.out.println("x="+x +" y="+y +" z="+z); //x=10 y=6 z=2
		
		System.out.println("===========2번===========");
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println((a<b) && (c>=a));
		System.out.println((a==b) || (a>=b) || (c>10));
		boolean result = !(c==3);
		System.out.println(result);
		
		
		System.out.println("===========3번===========");
//		6000원 이하 -> "훌륭"
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"

		int menuPrice = 10000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result3 = (menuPrice <= 6000) ? "훌륭" : (menuPrice <= 8000 ? "선방" : (menuPrice <= 12000 ? "눈물" : "물로배채우기"));
		System.out.println(result3);
		
	}

}
