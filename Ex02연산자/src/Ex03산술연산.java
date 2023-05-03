import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("JAVA 점수 입력: ");
		int javaScore = sc.nextInt();
		System.out.println("WEB 점수 입력: ");
		int webScore = sc.nextInt();
		System.out.println("ANDROID 점수 입력: ");
		int andScore = sc.nextInt();
		System.out.println("합계: "+(javaScore+webScore+andScore));
		
		
		System.out.println("평균: "+(((double)javaScore)+webScore+andScore)/3);
		System.out.println("평균: "+((javaScore+webScore+andScore)/3.0));
		System.out.printf("평균: %.2f",(((double)javaScore)+webScore+andScore)/3);
		
		
		
	}

}
