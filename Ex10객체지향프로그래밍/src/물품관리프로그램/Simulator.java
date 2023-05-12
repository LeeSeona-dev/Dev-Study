package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {
	
	//설계도를 사용하려면 main()안에서 작성해야한다.
	//Product: 사용자 정의 자료형
	//Product는 String,int,int가 저장되는 하나의 자료형
	//내가 만든 자료형(객체 자료형)
	
	public static void main(String[] args) {
		//메뉴 입력받기
		Scanner sc = new Scanner(System.in);
		int menu;
		
		//Product 자료형을 관리하는 ArrayList생성
		ArrayList<Product> pr = new ArrayList<Product>();

		
		while(true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				//물건 추가 
				//Product(설계도, 자료형)
				System.out.print("물건 이름 : ");
				String name = sc .next();
				
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
				
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				
				//1.사용자에게 입력받은 name,price,amount를 Product자료형으로 묶어주기
				Product p = new Product(name,unitPrice,amount);
				//2. pr.add(); ->데이터 저장
				pr.add(p);
				
			}else if(menu==2) {
				//예상 판매량 조회
				//pr안에 있는 데이터들을 다 확인(출력하기)
				
				System.out.println("제품명   단가   수량");
				for(int i =0; i<pr.size(); i++) {
					System.out.println(pr.get(i).getName()+"  "+pr.get(i).getUnitPrice()+
							"  "+pr.get(i).getAmount());
					
				}
				
				//판매시 전체 매출
				// 가격 * 수량
				int sum = 0;
				for(int i = 0; i<pr.size(); i++) {
					sum += (pr.get(i).getUnitPrice()*pr.get(i).getAmount());
					
					
				}System.out.println("판매시 매출 : "+sum);
				
			}else if(menu==3) { //3번 입력 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("숫자를 다시 입력하세요.");
			}
		}
		
		
	}

	

}
