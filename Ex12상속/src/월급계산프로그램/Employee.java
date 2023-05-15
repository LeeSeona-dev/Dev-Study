package 월급계산프로그램;

public abstract class Employee {
	//추상클래스
	//추상메서드 
	
	protected String empno;
	protected String name;
	protected int pay;
	
	//protected(접근제한자): 상속관계에 있는 클래스들은 접근이 가능하도록
	//도와주는 접근제한자
	//--->상속관계가 아닌 클래스는 접근이 불가능하도록 하는 제한자 
	
	//생성자 : 매개변수가 있는걸로
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	//상속관계에서 부모클래스가 생성자를 가지고 있으면 자식클래스에 super(매개변수);가 있어야함!
	
	//getMoneyPay -> 리턴타입 같다, 리턴하고 있는 결과값이 다름({body}가 다름)
	public abstract int getMoneyPay();
	
	//print, 리턴타입, {body}도 같음
	public String print() {
		return empno+ " : "+name+ " : "+ pay;
	}
	
}
