package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		//값 저장
		int num = 1;
	
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				// i : 0			1		  	  2			  3				4
				// j : 0 1 2 3 4	0 1 2 3 4	  0 1 2 3 4	  0 1 2 3 4		0 1 2 3 4
				// 값 : 1 2 2 2 2	3 1 2 2 2	  3 3 1 2 2	  3 3 3 1 2		3 3 3 3 1
				
				if(i == j) {
					arr[i][j] = 1;
				}
				else if(i < j) {
					arr[i][j] = 2;
				}
				else {
					arr[i][j] = 3;
				}
				
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

}
