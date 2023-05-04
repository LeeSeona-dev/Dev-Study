import java.util.Random;
import java.util.Scanner;

public class 보충수업Q2 {

	public static void main(String[] args) {
		// 가위바위보 게임
		//1. 나는 숫자 1(가위), 2(바위),3(보)중 하나를 입력
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int cnt=0;
		
		while(true) {
			System.out.print("나 : ");
			int num=sc.nextInt();
			System.out.print("컴퓨터 : ");
			int com=rd.nextInt(3);
			System.out.println(com);
			
			//내가 이긴 경우 진경우 비긴 경우 각각 출력
			//매 회 이긴 횟수를 출력해준다.
			if((num==1 && com==3)||(num==2 && com==1) ||(num==3 && com==2) ) {
				System.out.println("이겼습니다.");
			}else if((num==1 && com==2)||(num==2 && com==3)||(num==3 && com==1)) {
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}

	}

}
