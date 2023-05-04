import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		// 랜덤 기능 사용하기
		//밑에 내용들이 계속 반복됨
		//랜덤 숫자 2개를 가져온다
		//출력 -> 답을 입력 받는다
		//답이 맞다면 while문 처음으로 돌아감
		//틀린경우 사용자한테 계속 할건지 물어본다
		// 사용자가 N/Y를 입력한다
		//	Y: while문 처음으로 돌아감
		//	N:break;
		//사용자가 틀린 횟수가 3번 이상 break;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("====PLUS GAME====");
		int sum=0;  //nu1+num2->정답 변수
		int wrong=0;  //몇번틀렸는지 세주는 변수
		int correct=0;
		
		while(true) {
			int num1=rd.nextInt(50)+1;
			int num2=rd.nextInt(50)+1;
			
			System.out.print(num1+ " + "+num2+" = ");
			int answer=sc.nextInt();
			sum=num1+num2;
			if(answer==sum) {  //정답이 맞았을 경우 while문 처음으로 돌아감
				System.out.println("Success");
				++correct;
			}else { //틀렸을 경우 계속 할건지 묻는다 -> Y/N 으로 입력 받기
				++wrong;  //틀렸을경우 +1 한 후 3번이 되면 종료
				System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
						+ "████▌▄▌▄▐▐▌█████\r\n"
						+ "████▌▄▌▄▐▐▌▀████\r\n"
						+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n"
						+ "");
				System.out.print("계속 하시겠습니까?");
				String yesno=sc.next();
				if(yesno.equals("Y")) {
					if(wrong==3) {
						System.out.println("Game over");
						System.out.println("맞힌 개수 : "+correct);
						System.out.println("틀린 개수 : "+wrong);
						break;
						
					}
				}else if(yesno.equals("N")) {
					System.out.println("종료합니다.");
					System.out.println("맞힌 개수 : "+correct);
					System.out.println("틀린 개수 : "+wrong);
					break;
				}
				
			}

		}
	}	

}
