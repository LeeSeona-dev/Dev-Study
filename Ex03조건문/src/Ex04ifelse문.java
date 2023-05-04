import java.util.Scanner;

public class Ex04ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 : ");
		int pay=sc.nextInt();
		
		System.out.print("사람 명 수 : ");
		int person =sc.nextInt();
		
		int sum = pay/person;
		
		if(sum>=10000) {
			System.out.println("10000원 이상 지불");
		} else {
			System.out.println("10000원 미만 지불");
		}

	}

}
