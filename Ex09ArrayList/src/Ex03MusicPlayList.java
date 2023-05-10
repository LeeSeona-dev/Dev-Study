import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList<String>();
		int cnt =0;	//처음 카운트
	
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3] 종료 >> ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("=========현재 재생목록========");
				for(int i =0; i<al.size(); i++) {	//for문으로 저장된 재생목록 출력 
					System.out.println(i+1+". "+al.get(i));
				}
				
				if(cnt==0) {	//처음 노래추가 할 때 재생목록이 없음 출력,메뉴[1]번일때 cnt동작
					System.out.println("재생 목록이 없습니다.");
					System.out.println("======================");
					cnt++;
				}
				
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				menu = sc.nextInt();
				if(menu==1) {	//[1]마지막 위치에 추가
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine(); //엔터키(공백문자)처리
					String name =sc.nextLine();
					al.add(name);
					System.out.println("추가가 완료되었습니다.");
				}else {	//[2]원하는 위치에 추가
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine(); //엔터키(공백문자)처리
					String name = sc.nextLine();
					System.out.print("추가 할 위치 입력 >> ");
					int num = sc.nextInt();
					al.add(num,name);
					System.out.println("추가가 완료되었습니다.");
				}
			}
			else if(menu==2) {	//[2] 노래 삭제 
				System.out.println("=========현재 재생목록========");
				if(cnt==0) {	//노래 없을때 출력, cnt가 0일때
					System.out.println("재생 목록이 없습니다.");
					System.out.println("========================");
				}else {	//for문으로 재생목록 저장되어있을때 출력!
					for(int i =0; i<al.size(); i++) {
						System.out.println((i+1)+"."+al.get(i));
					}
				
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int num =sc.nextInt();
					if(num==1) {	//[1]선택삭제
						System.out.print("삭제할 노래 선택 >> ");
						num = sc.nextInt();	//삭제할 인덱스 위치 입력받기
						al.remove(num);	//입력받은 위치의 노래 삭제
						System.out.println("노래가 삭제되었습니다.");
					}else {	//[2]전체삭제
						al.clear();
						System.out.println("전체 List가 삭제 되었습니다.");
					}
				}
			}else {	//[3] 프로그램 종료
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
		}

	}
	
//	public static void playlist(ArrayList<String>al,int menu,int cnt) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		
//		if(menu==1) {
//			System.out.println("=========현재 재생목록========");
//			for(int i =0; i<al.size(); i++) {	//for문으로 저장된 재생목록 출력 
//				System.out.println(i+1+". "+al.get(i));
//			}
//			
//			
//			if(cnt==0) {	//처음 노래추가 할 때 재생목록이 없음 출력,메뉴[1]번일때 cnt동작
//				System.out.println("재생 목록이 없습니다.");
//				System.out.println("======================");
//				cnt++;
//			}
//		
//		}else if(menu==2) {	//[2] 노래 삭제 
//			System.out.println("=========현재 재생목록========");
//			if(cnt==0) {	//노래 없을때 출력, cnt가 0일때
//				System.out.println("재생 목록이 없습니다.");
//				System.out.println("========================");
//			}else {	//for문으로 재생목록 저장되어있을때 출력!
//				for(int i =0; i<al.size(); i++) {
//					System.out.println((i+1)+"."+al.get(i));
//				}
//			}	
//	}


	//}
}