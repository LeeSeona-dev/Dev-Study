import java.util.Scanner;

public class Ex06삼항연산 {

	public static void main(String[] args) {
		// 두개 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값 출력하기
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2=sc.nextInt();
		
		System.out.println("두 수의 차 : " + (num1>num2 ? num1-num2 : num2-num1));

	}

}
