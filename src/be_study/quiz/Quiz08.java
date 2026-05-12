package be_study.quiz;
import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2026년으로 함.
		//나이는 단순하게 2025년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 27살
		//1996년생 = 31살

		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 27살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 29살 남자입니다.
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int birth = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		int age = 2026 - birth + 1;
		
//		if(birth >= 2000) {
//			
//			System.out.printf("%d살 ", age);
//			if(num == 3) {
//				System.out.println("남자입니다.");
//			} else if(num == 4) {
//				System.out.println("여자입니다.");
//			} else {
//				System.out.println("잘못된 입력입니다.");
//			}
//		} else if(birth < 2000) {
//			System.out.printf("%d살 ", age);
//			if(num == 1) {
//				System.out.println("남자입니다.");
//			} else if(num == 2) {
//				System.out.println("여자입니다.");
//			} else {
//				System.out.println("잘못된 입력입니다.");
//			}		
//		}
		
		if(birth >= 2000) {
			if(num == 3) {
				System.out.printf("결과 : %d살 남자입니다. \n", age);
			} else if(num == 4) {
				System.out.printf("결과 : %d살 여자입니다. \n", age);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} else if(birth < 2000) {
			if(num == 1) {
				System.out.printf("결과 : %d살 남자입니다. \n", age);
			} else if(num == 2) {
				System.out.printf("결과 : %d살 여자입니다. \n", age);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		//개별조건 엮어서 더 상세히 비교
		if( birth < 2000 && num == 1) {
			System.out.printf("결과 : %d살 남자입니다. \n", age);
			
		} else if( birth < 2000 && num == 2) {
			System.out.printf("결과 : %d살 여자입니다. \n", age);
			
		} else if( birth >= 2000 && num == 3) {
			System.out.printf("결과 : %d살 남자입니다. \n", age);
			
		} else if( birth >= 2000 && num == 4) {
			System.out.printf("결과 : %d살 여자입니다.\n", age);
			
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		//정상범위 먼저 체크
//		if( (birth < 2000 && (num == 1 || num == 2)) 
//				||
//			(birth >= 2000 && (num == 3 || num == 4))
//			) {
//			//입력은 정상이다
//			
//			if(num == 1 || num == 3) {
//				System.out.printf("결과 : %d살 남자입니다.", age);
//			} else {
//				System.out.printf("결과 : %d살 여자입니다.", age);
//			}
//			
//		} else {
//			System.out.println("잘못된 입력입니다.");
//		}
	}
}
