package 월급계산프로그램;

public class PartTimeEmployee extends Employee {
	//필드
	
	int workDay;
	
	public PartTimeEmployee(String empno,String name, int pay, int workDay) {
		super(empno, name, pay);	//super() -->부모클래스의 생성자를 지칭하는 키워드
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}
	
//	public int getMoneyPay() {
//		return pay*workDay;
//	}

}
