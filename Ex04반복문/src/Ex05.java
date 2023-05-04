import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//8시간 이하 근무 : work*5000
		//8시간 초과 근무 : 8*5000+ ((work-8)*5000*1.5)
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요: ");
		int time=sc.nextInt();
		
		
		int pay=time>8 ? (time*5000)+(int)((time-8)*5000*1.5) : (time*5000); 
		System.out.printf("총 임금은 %d 원 입니다.",pay);		
			
		}
	}


