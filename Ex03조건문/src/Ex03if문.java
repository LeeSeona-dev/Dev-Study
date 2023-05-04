import java.util.Scanner;

public class Ex03if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int java=sc.nextInt();
		
		System.out.print("Python 점수 입력 : ");
		int python=sc.nextInt();
		
		System.out.print("Android 점수 입력 : ");
		int android=sc.nextInt();
		
		//실수형으로 보려면 (java+python+android)/3.0 
		//실수와 정수 비교 가능
		if((java+python+android)/3 >=80) {
			System.out.println("합격!");
			
		} else { //위 경우에 해당하는 경우가 아닐경우
			System.out.println("불합격");
		}
		
		System.out.println("맨아랫줄");
	}

}
