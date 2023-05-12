package 물품관리프로그램;

import java.util.ArrayList;


public class Product {
	
	//필드
	//물건이름, 단가, 수량
	private String name;
	private int unitPrice;
	private int amount;
	
	//생성자:
	//1)생성자도 메서드다
	//2)생성자 이름이 클래스명과 같다
	//3)생성자는 리턴타입이 없다(void x)
	//4) 기본생성자는 생략되어있음
	//->새로운 생성자를 만들면 기본생성자는 기능을 잃는다
	//->기본생성자도 사용하고 싶다면 코드로 작성
	
	//3개 매개변수 생성자
	//객체 생성시 name,unitPrice,amount 초기화
	public Product(String name, int unitPrice,int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public int getAmount() {
		return amount;
	}
	

	
	
}
