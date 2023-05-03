import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초 입력: ");
		int time = sc.nextInt();
		//초->시간 (60*60) 3600 나누기
		int hour=time/(60*60);
		int minute=(time/60-(hour*60));
		//초는 시간을 60으로 나눈 나머지
		int second=time%60;
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
		//3723초-> 1시(3600초) 2분(60초) 3초
		/*
		 * int hour = time/3600;
		 * int minute = time%3600/60;
		 * int second=time%3600%60;
		 * 연산을 줄여줌 결과는 같음
		 * int second=time%60;
		 */
		
	}

}
