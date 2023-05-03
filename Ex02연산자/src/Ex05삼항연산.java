import java.util.Scanner;

public class Ex05삼항연산 {

	public static void main(String[] args) {
		
		//정수를 입력받아 홀수인지 짝수인지 판별
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		// 짝수는 2의 배수(2로 나눴을 때 나머지가 0), 2의 배수 아닐 경우 홀수
		System.out.println(((num%2==0)? num+"은 짝수입니다.": num +"은 홀수입니다." ));
		System.out.println(num +((num%2==0)? "은 짝수입니다.": "은 홀수입니다." ));
		
		
		String s = (num%2==0)? "짝수입니다.":"홀수입니다.";
		System.out.println(s);
	}

}
