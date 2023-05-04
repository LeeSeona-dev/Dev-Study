import java.util.Scanner;

public class Exwhile로그인문제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int check=0;
		
		while(true) {
			System.out.print("아이디 : ");
			String id=sc.next();
			
			System.out.print("비밀번호 : ");
			int pw=sc.nextInt();
			
			
			if(id.equals("smhrd")&& pw== 1234 ) {  //로그인성공조건
				System.out.println("로그인성공");
				break;
				
			}else {
				System.out.println("로그인실패");
				System.out.print("계속 하시겠습니까? ");
				String yesno=sc.next();
		
				//실패했을때 다시 로그인 Y / N
				if(yesno.equals("Y")) {
					++check;                 //y를 눌렀을때 check가 1씩 증가
					
						if(check>=3) {        //check 3번일경우 프로그램 종료
						System.out.println("본인인증을 해주세요");
						break;	
					}	else {
						//System.out.println(check);
					}
					
				}else if(yesno.equals("N")){
					break;
				}
				
			}
			
		}
		

	}

}
