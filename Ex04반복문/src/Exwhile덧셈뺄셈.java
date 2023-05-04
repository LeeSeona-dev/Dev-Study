import java.util.Scanner;

public class Exwhile덧셈뺄셈 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0; //두 정수 계산
		String yn=null;// Y/N 입력받기
		
		while(true) {
			System.out.print("정수1: ");
			int num1=sc.nextInt();
			System.out.print("정수2: ");
			int num2=sc.nextInt();
			System.out.print("연산자(+/-) : ");
			String addsub=sc.next();
			
			
			if(addsub.equals("+")) {
				sum=num1+num2;
				System.out.println(num1 +"+"+ num2+" "+ "="+sum);
				System.out.print("계속하시겠습니까? (Y/N) : ");
				yn=sc.next();
				if(yn.equals("Y")) {
					
				}else if(yn.equals("N")) {
					System.out.println("종료!");
					break;
				}
			}else if(addsub.equals("-")) {
				sum=num1-num2;
				System.out.println(num1 +"-"+ num2+" "+ "="+sum);
				System.out.print("계속하시겠습니까? (Y/N) : ");
				yn=sc.next();
				if(yn.equals("Y")) {
					
				}else if(yn.equals("N")) {
					System.out.println("종료!");
					break;
				}
			}

	   }

    }
}