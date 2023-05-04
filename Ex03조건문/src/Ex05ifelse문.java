import java.util.Scanner;

public class Ex05ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소프트웨어 설계 : ");
		int num1 = sc.nextInt();
		System.out.println("소프트웨어 개발 : ");
		int num2 = sc.nextInt();
		System.out.println("데이터베이스 구축 : ");
		int num3 = sc.nextInt();
		System.out.println("프로그래밍 언어 활용 : ");
		int num4 = sc.nextInt();
		System.out.println("정보시스템 구축 관리 : ");
		int num5 = sc.nextInt();
		
		
		int sum=num1+num2+num3+num4+num5;
		//합격조건
		//1.각 과목 개수 모두 8이상
		//2.과목 총 합이 60 이상 -> 두 조건 모두 해당
		if(num1>=8 && num2>=8 && num3>=8 && num4>=8 && num5>=8 && sum>=60 ) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
