import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//넣을 금액, 메뉴 입력받기
		System.out.print("넣을 금액 :  ");
		int money=sc.nextInt();
		
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> " );
		int menu=sc.nextInt();
		//잔돈 변수 생성
		int charge=0;
		
		//금액,메뉴에 따라 둘 다 true일 때 잔돈을 계산, 출력 
		//charge = money-각 메뉴 가격
		
		if(money>=1800 && menu==1) {
			charge = money-1800;
			System.out.println("잔돈 : " + charge+"원");
		}else if(money>=2000 && menu==2) {
			charge = money-2000;
			System.out.println("잔돈 : " + charge+"원");
		}else if(money>=1200 && menu==3) {
			charge = money-1200;
			System.out.println("잔돈 : " + charge+"원");
		}else {
			System.out.println("돈이 부족해요.");
		}
		
		System.out.println("천원 : "+ (charge/1000));
		System.out.println("오백원 : "+ (charge%1000/500));
		System.out.println("백원 : "+ (charge%500/100));
		
	}

}
