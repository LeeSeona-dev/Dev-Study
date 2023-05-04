import java.util.Scanner;

public class Ex08다중ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("잔액 : ");
		
		int pay = sc.nextInt();
		
		System.out.print("성인/청소년/어린이: ");
		String people = sc.next();
		
		// 잔액 충분한지?
		// 성인/청소년/어린이인지?
		if(pay>=1800 && people.equals("성인")) {
			System.out.println("감사합니다.");
		}else if(pay>=1500 && people.equals("청소년")) {
			System.out.println("반갑습니다.");
		}else if(pay>=1000 && people.equals("어린이")) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
