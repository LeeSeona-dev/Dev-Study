import java.util.Scanner;

public class Ex04while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myWeight=0;
		int goal=0;
		int total=0;
		int sum=0;
		int weekWeight=0;
		int week=0;
		
		System.out.print("현재 몸무게 : ");
		myWeight=sc.nextInt();
		
		
		System.out.print("목표 몸무게 : ");
		goal=sc.nextInt();
	
		while(true) {
			System.out.print((++week) + "주차 감량 몸무게  : ");
			weekWeight=sc.nextInt();
			sum+=weekWeight;
			total=myWeight-sum;
			
			System.out.println("현재 몸무게 : " + total);
		}
	
	}
}


