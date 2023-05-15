package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		
		RegularEmployee e1 = new RegularEmployee("SMHRD001", "김미희", 4000, 0);
		
		System.out.println(e1.print());
		
		RegularEmployee e2 = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		
		System.out.println(e2.print());
		System.out.println(e2.getMoneyPay());
		
		TempEmployee e3 = new TempEmployee("SMHRD002","박문수",3000);
		System.out.println(e3.print());
		System.out.println(e3.getMoneyPay());
		
		PartTimeEmployee e4 = new PartTimeEmployee("SMHRD003","임성훈",10, 10);
		System.out.println(e4.print());
		System.out.println(e4.getMoneyPay());
		
		//Employee라는 클래스 -
		//Regular, PartTime, Temp
		//공통적인 필드, 공통적인 기능
		// 상속 + 추상 ->main 실행시 문제 없으면 성공
		//생성자는 그대로 두고 --> 생성자도 상속시켜주고 싶으면? 
		//참고 : super(); <--부모 클래스의 생성자를 지칭, 캡슐화x

	}

}
