import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {
		
		//입력받은 값이 20보다 크거나 같으면 "성인입니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		//입력한 나이가 20 이상이니?
		//참 -> "성인입니다"
		//거짓 -> 아무 행동도 하지않음
		
		//if(조건식 : 결과값이 true of false(boolean))
		//    -> 비교 연산자, 논리연산자
		if(age >= 20) {
			//조건식의 결과가 참(true)일때 실행
			System.out.println("성인입니다.");
		}
		
		System.out.println("맨 아랫줄!");
		
		//dead code : 절대 실행 안되는 코드!(의미가 없음)
		if(false) {
			System.out.println("!");
			
		}
		
		
	}

}
