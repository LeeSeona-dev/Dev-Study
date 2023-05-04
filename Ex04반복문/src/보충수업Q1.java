
import java.util.Scanner;

public class 보충수업Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count=0; 	//틀렸을때 카운트하는 변수
		while(true) { //무한반복
			
			//아이디 입력받기
			System.out.print("아이디 : ");
			String id=sc.next(); 
			//비밀번호 입력받기
			System.out.print("비밀번호 : ");
			String pw=sc.next();
			
			//아이디랑 비밀번호가 맞는지 조건식
			//둘 다 맞을경우 && 로그인 성공
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("로그인 성공");
				break;			//로그인 성공 프로그램 종료
			}else { 			 //하나라도 틀릴경우 로그인 실패
				++count;		//로그인 실패로 들어올 경우 count가 ++된다.
				System.out.println("로그인 실패");
				System.out.print("계속 하시겠습니까? ");
				String answer=sc.next();	//계속하시겠습니까 답 Y/N 입력받기
				if(answer.equals("Y")) {		//Y일경우 계속 반복
					if(count>=3) { 				//3번 카운트 되면 종료
						System.out.println("본인인증을 해주세요"); 
						break;
					}
				}else if(answer.equals("N")) { //응답이 N일경우 while문 빠져나가기!
					break;
				}
			}
		}
		
		
	}

}
