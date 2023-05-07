import java.util.Scanner;

public class Ex07배열로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 회원가입 2. 로그인 3. 종료");
		String id ;	//현재 로그인하는 사용자 id
		String pw ;
		String[] id_arr=new String[3];
		String[] pw_arr = new String[3];
		
		int num;
		boolean sw = true; 	//true : 로그인 불가/ false: 로그인 가능
		
		int cnt = 0; //몇 명이 가입했는지 기억하는 변수
		
		while(true) {
			
			num = sc.nextInt();
			System.out.print("아이디 : ");
			for(String i : id_arr) {
				System.out.print(i+" ");
			}
			for(String p : pw_arr) {
				System.out.print(p + " ");
			}System.out.println();
			if(num==1) {
				
				System.out.println("===회원가입===");
				
				
				System.out.print("id 입력 : ");
				id_arr[cnt]= sc.next();
				System.out.print("pw 입력 : ");
				pw_arr[cnt] = sc.next();
				
				
				if(cnt==3) {
					 System.out.println("회원가입 불가");
				}
				
				
				
			}else if(num==2) {
				System.out.println("1. 회원가입 2. 로그인 3. 종료");
				System.out.println("===로그인===");
				//로그인 안에서는 배열 내용 수정 X 읽고 같은지 확인만 해야함.
				System.out.print("id 입력 : ");
				id= sc.next();
				System.out.print("pw 입력 : ");
				pw = sc.next();
				
				for(int i = 0; i<cnt; i++) {
					if(id_arr[i].equals(id) && pw_arr[i].equals(pw)) {
						System.out.println("로그인 성공");
						sw = false;
						break;	//회원정보가 겹치지 않으니 가입하는 순간 더이상 확인하지 않게!
					}
				}
				if(sw) {
					System.out.println("로그인 실패");
				}
			
			
			}else if(num==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	
	}

}
