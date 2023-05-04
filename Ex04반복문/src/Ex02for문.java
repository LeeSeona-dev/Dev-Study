import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		// 1~100까지 중 3의 배수를 출력
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		
		
		//1~100까지 중 3의 배수이면서 5의 배수를 출력
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		
		//한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
		
		Scanner sc= new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		int num=sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
		
		
		
	}

}
