import java.util.Scanner;

public class Ex08삼항연산 {

	public static void main(String[] args) {
		//ctrl+shift+f -> 자동 정렬!!
		// 기본 시급 9000원, 8시간이 넘을경우 초과 시간 시급의 1.5배
		//8시간 이하 근무 : work*9000
		//8시간 초과 근무 : 8*9000+ ((work-8)*9000*1.5)
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("노동 시간을 입력하세요 : ");
		
		int work=sc.nextInt();
		int work1= work-8;
		int sum = work>=8 ? (work-work1)*9000 + (int)(work1*9000*1.5) : work*9000;
		
		System.out.println("총 임금은 "+sum +"원 입니다.");

		//실수 -> 정수 형변환 절대 자동형변환 해주지 않음!!
		//같은 크기더라도 실수가 표현범위가 더 넓기 때문에.
		
		
		//int pay = work>8? 8*9000 +(work-8)*9000*(int)1.5 : 9000*work;
		//기본시급값 변수 생성 -> 매년 바뀌는 시급, 변수로 바꿀수있음
		int 기본시급 = 9000;
		
		double pay=work>8? 8*9000 +(work-8)*9000*1.5: 9000*work;
		double pay1=work>8? 8*기본시급 +(work-8)*기본시급*1.5: 기본시급*work;
		System.out.printf("총 임금은 %.0f원 입니다.",pay);
	}

}
