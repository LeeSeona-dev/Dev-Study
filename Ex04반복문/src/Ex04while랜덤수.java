import java.util.Random;
import java.util.Scanner;

public class Ex04while랜덤수 {

	public static void main(String[] args) {
		
		int sum=0; //정답 변수 생성
		int correct=0;
		int wrong=0;
		
		while(true) {
			
			Random rd=new Random();
			int ran1=rd.nextInt(10);
			System.out.print(ran1+ " + ");
			int ran2=rd.nextInt(10);
			System.out.print(ran2+ " = ");
			Scanner sc=new Scanner(System.in);
			int as=sc.nextInt();
			
			sum=ran1+ran2;
			
			if(sum==as) {
				System.out.println("Success!");
				System.out.print("계속 하시겠습니까?");
				String yesno=sc.next();
				if(yesno.equals("Y")) {
					
				}else if(yesno.equals("N")) {
					System.out.println("종료!");
					System.out.println("맞춘 개수 : ");
					System.out.println("틀린 개수 : ");
					break;
				}
				
				
			}else {
				System.out.println("Fail!");
				System.out.print("계속 하시겠습니까?");
				String yesno=sc.next();
				if(yesno.equals("Y")) {
					//기존 문제 다시 출력하기
					while(sum!=as) {
						System.out.print(ran1+ " + "+ ran2+" = ");
						as=sc.nextInt();
						System.out.println("Fail!");
						System.out.print("계속 하시겠습니까?");
						yesno=sc.next();
						if(yesno.equals("Y")) {
							
						}else if(yesno.equals("N")) {
							System.out.println("종료!");
							System.out.println("맞춘 개수 : ");
							System.out.println("틀린 개수 : ");
							break;
						}
						
					}
					
				}else if(yesno.equals("N")) {
					System.out.println("종료!");
					System.out.println("맞춘 개수 : ");
					System.out.println("틀린 개수 : ");
					break;
				}
			}
		}

	}

}
