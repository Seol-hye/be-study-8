package be_study.quiz.quiz29;

public class TopScoreStudent {
	public static void main(String[] args) {
		// 배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily",
				"Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};

		// 1등 인덱스 검색
		int i = topIndex(scores);

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		}

		// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
		public static int topIndex(int[] arr) {
		/* 해당 함수를 완성하세요. */
			//arr 점수들의 배열 -> 최대값 찾기 -> 최대값이 위치한 인덱스 찾기
			
			//반복 -> 큰값 비교 -> 더 큰값 저장
			// 작은값? 작은값 비교
			int max = arr[0]; //최고점수
			int maxIndex = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i]; //최대값
					maxIndex = i; //최고점수인 인덱스를 기록해야하므로 저장
				}
			}
		return maxIndex; //최대값X 최대값 위치 인덱스O
	}

}
