import java.util.Random;
import java.util.Scanner;

public class 보충수업Q2가위바위보 {

	public static void main(String[] args) {
		
		//1. 가위바위보 게임 출력
		//2. 사용자 입력
		//3. 컴퓨터의 출력(랜덤)
		
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("[가위바위보 게임]");
		int my=0;
		int com=0;
		int myLoss=0;
		int comLoss=0;
		
		while(true) {
			
			if(comLoss==3 || myLoss==3) {
				System.out.println("게임종료");
				break;
			}
			System.out.print("가위(1), 바위(2), 보(3) >> ");
			my=sc.nextInt();
			com=rd.nextInt(3)+1;
			System.out.println("컴퓨터 : " +com);
			if(my==1) {
				if(com==1) {
					System.out.println("비겼습니다.");
				}else if(com==2) {
					System.out.println("졌습니다.");
					myLoss++;
				}else {
					System.out.println("이겼습니다.");
					comLoss++;
				}
			}else if(my==2) {
				if(com==1) {
				System.out.println("이겼습니다.");
				comLoss++;
			}else if(com==2) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("졌습니다.");
				myLoss++;
			}
		} else {
			if(com==1) {
				System.out.println("졌습니다.");
				myLoss++;
			}else if(com==2) {
				System.out.println("이겼습니다.");
				comLoss++;
			}else {
				System.out.println("비겼습니다.");
			}
		}	System.out.println("내가 이긴 횟수: "+comLoss);
		System.out.println("컴퓨터가 이긴 횟수: "+myLoss);
	}	
	}

}
