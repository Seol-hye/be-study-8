package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		//1번
		int x = 10;
		int y = 4;
	
		int result = x/y; 
		double result12 = (double)x/y;
		System.out.println(result);
		System.out.println(result12);
	
		//2번. 결과 7.5가 나오도록 작성
		double a = 3.5;
		double b = 4.7;
		double result2 = a + (int)b;
		System.out.println(result2);
		
		//3번. 결과 12가 나오도록 작성
		//문자열 -> 숫자형
		String a3 = "3.4";
		String b3 = "4";
		int result3 = (int)Double.parseDouble(a3) * Integer.parseInt(b3);
		System.out.println(result3);

		
		//4번. 계산결과가 "1013"이 나오도록 코드를 작성
		
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 +(Integer.parseInt(a4)+b4);
		//String result4 = a4 + (int)(b4*c4);
		System.out.println(result4);
		
		//5번. 계산결과가 "243"이 나오도록 코드를 작성
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = (a5 * (int)Double.parseDouble(c5)) + "" + (int)b5;
		//                                                   String.valueof
		System.out.println(result5);
		
		//6번
		int x6 = 111;
		int y6 = 13;
		int result6 = x6 % y6;
		int result62 = x6 / y6;
		System.out.println(result6);
		System.out.println(result62);
	
	}

}
