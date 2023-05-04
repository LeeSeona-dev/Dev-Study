import java.util.Scanner;

public class Exwhile몸무게 {

	public static void main(String[] args) {
		
		//1.입력하는 도구 가져오기
		//2.현재몸무게 출력문, 입력받기
		//3.목표몸무게 출력문, 입력받기
		//4.출력문, 입력받기(반복)
		// 4번은 목표몸무게에 도달할때까지 반복
		//5.출력문
		//in-콘솔창에 입력 out-콘솔창에 출력
		Scanner sc = new Scanner(System.in);
		int myWeight=0;  //처음입력받는 몸무게
	    int goal=0;		//목표 몸무게
	    int total=0;	//최종 몸무게	
	    int sum=0;		//주마다 감량된 몸무게를 합한 변수
	    int weekWeight=0;  //주차 감량 몸무게
	    int week=0;			//매주차 세는 변수
	     
	    System.out.print("현재 몸무게 : ");
	    myWeight=sc.nextInt();
	      
	      
	    System.out.print("목표 몸무게 : ");
	    goal=sc.nextInt();
	    
	    while(true) {
	    	
	         System.out.print((++week) + "주차 감량 몸무게 : ");
	         weekWeight=sc.nextInt();   //매주 감량 몸무게
	         sum+=weekWeight;		//매주 감량 몸무게를 계속 더해 합계
	         total=myWeight-sum;	//내 최종 몸무게= 처음몸무게-합계
	         if(total<=goal) { 		//종료조건 : 목표몸무게보다 작거나 같은지
	        	 System.out.println("최종몸무게 : "+total);
	        	 System.out.println("축하합니다!");
	        	 break;
	         }
	         
	       
	      }
		

	}

}
