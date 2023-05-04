import java.util.Random;
import java.util.Scanner;

public class Ex숫자맞추기게임 {

	public static void main(String[] args) {
		
		//1. 도구 불러오기
		//2. 게임 시작 문구 출력 ->1번만
		//랜덤한 숫자 한개 -> 한번만 실행!
		//3번부터 반복!
		//3. 출력문 : 입력
		//입력한 값이 랜덤 숫자와 일치하는 판단
		//ctrl + shift + o ==> 한꺼번에 import 단축키
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("=====1부터 100 사이 숫자 맞추기 게임!=====");
		int num=rd.nextInt(100)+1;
		
		while(true) {
			System.out.print("1과 100사이의 정수를 입력하세요 >> ");
			int input=sc.nextInt();
			if(input>num) {
				System.out.println("더 작은 수로 다시 시도해 보세요.");
				
			}else if(input<num) {
				System.out.println("더 큰 수로 다시 시도 해보세요.");
				
			}else if(input==num) {
				System.out.println("정답입니다.");
				break;
			}
		}
		
	}

}
