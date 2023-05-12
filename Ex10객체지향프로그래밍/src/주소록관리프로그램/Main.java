package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 설계도를 사용하는 공간
		Scanner sc = new Scanner(System.in);
		int menu;

		// Address자료형(클래스)를 관리하는 ArrayList 생성
		ArrayList<Address> ar = new ArrayList<Address>();
		
		boolean sw = true;

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			menu = sc.nextInt();

			if (menu == 1) {	//[1]추가
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				//이름, 나이, 전화번호--> Address()-->ar
				// 사용자에게 입력받은 내용->Address자료형으로 묶어주기
				Address ad = new Address(name, age, phoneNumber);	//ad 객체 생성!!
				// 저장
				ar.add(ad);

			} else if (menu == 2) {	//[2]전체조회
				// ar에 있는 정보를 모두 출력하기
				// 등록되어있는 연락처 없을시 문구 출력
//				if (ar.size() == 0) {
//					System.out.println("등록된 연락처가 없습니다.");
//				}	//ar ---> i--->(name,agn,phonnumber를 가지고 있는 주소값)--->getName()
//				for (int i = 0; i < ar.size(); i++) {
//					System.out.println((i + 1) + ". " + ar.get(i).getName() + "(" + ar.get(i).getAge() + "세)" + " : "
//							+ ar.get(i).getPhoneNumber());
//				}
				noInfo(ar);

			} else if (menu == 3) {	//[3]삭제
//				if (ar.size() == 0) {
//					System.out.println("등록된 연락처가 없습니다.");
//				}
//
//				for (int i = 0; i < ar.size(); i++) {
//					System.out.println((i + 1) + ". " + ar.get(i).getName() + "(" + ar.get(i).getAge() + "세)" + " : "
//							+ ar.get(i).getPhoneNumber());
//				}
				noInfo(ar);
				System.out.print("삭제할 번호 입력 : ");
				int num = sc.nextInt();
				//실제 삭제할 데이터의 위치(인덱스값) == 사용자 입력값 -1
				ar.remove(num - 1);

			} else if (menu == 4) {	//[4] 검색

				// 검색할 이름을 입력받아 정보 출력하기
				System.out.print("검색 할 이름 입력 : ");
				String name = sc.next();
				for (int i = 0; i < ar.size(); i++) {
					if (name.equals(ar.get(i).getName())) {//String -->equals 메서드
						System.out.println((i + 1) + ". " + ar.get(i).getName() + "(" + ar.get(i).getAge() + "세)"
								+ " : " + ar.get(i).getPhoneNumber());
						sw = false;
					}if(sw==false) {
						System.out.println("검색한 이름의 정보가 없습니다.");
					}
				}
				

			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("숫자를 다시 입력하세요.");
			}
		}
		
	}
	
	//반복되는부분 메서드만들기
	
	public static void noInfo(ArrayList<Address> ar) {
		if (ar.size() == 0) {
			System.out.println("등록된 연락처가 없습니다.");
		}
		for (int i = 0; i < ar.size(); i++) {
			System.out.println((i + 1) + ". " + ar.get(i).getName() + "(" + ar.get(i).getAge() + "세)" + " : "
					+ ar.get(i).getPhoneNumber());
		}
	}
	

}