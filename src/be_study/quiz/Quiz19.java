package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.

//		1.
//		1   2   3   4
//		5   6   7   8
//		9   10 11 12
//		13 14 15 16

		int[][] arr1 = new int[4][4];
		int n1 = 1;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				
				//i: 0 0 0 0 	1 1 1 1 	2 2  2  2 	3  3  3  3 
				//j: 0 1 2 3	0 1 2 3		0 1  2  3 	0  1  2  3
			//	출력: 1 2 3 4	5 6 7 8		9 10 11 12	13 14 15 16
				arr1[i][j] = n1++;
		        //n1++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
//		2.
//		1 5 9  13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16
		
		System.out.println("=======================");

		int[][] arr2 = new int[4][4];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				
				//i: 0 0 0 0 	1 1 1 1 	2 2  2  2 	3  3  3  3 
				//j: 0 1 2 3	0 1 2 3		0 1  2  3 	0  1  2  3
			//	출력: 1 5 9 13	2 6 10 14	3 7  11 15	4  8  12 16
				arr2[i][j] = (i+1)+(j*4);
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
//		int n2 = 1;
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				arr2[j][i] = n2++;
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		3.
//		16 15 14 13
//		12 11 10 9
//		8   7   6  5
//		4   3   2  1
		
		//i: 3  3  3  3 	2  2  2  2 		2 2 2 2 	3 3 3 3 
//		//j: 3  2  1  0		3  2  1  0		3 2 1 0 	3 2 1 0
//	//	출력: 16 15 14 13	12 11 10 9		8 7 6 5		4 3 2 1
		
		System.out.println("=======================");


		int[][] arr3 = new int[4][4];
		int n3 = 16;
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=arr3[i].length-1; j>=0; j--) {
				
				arr3[i][j] = n3--;
		        //n3--;
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		4.
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9  5  1
		
		System.out.println("=======================");
		
		int[][] arr4 = new int[4][4];
		int n4 = 16;
		
		for(int i=arr4.length-1; i>=0; i--) {
			for(int j=arr4[i].length-1; j>=0; j--) {
				
				arr4[i][j] = (i+1)+(j*4);
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}

	}

}
