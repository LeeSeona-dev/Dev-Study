import java.util.Scanner;

public class Ex03while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input=0;
		int sum=0; //지금까지 입력한 수의 합 저장(누적합)->보통 0으로 초기화
		int odd=0; //홀수개수
		int even=0; //짝수 개수
		
		while(true) {
			System.out.print("숫자 입력: ");
			//sum+=input;
			input = sc.nextInt();
				
			if(input==-1) {	
				break;
					
			}	
			
			if(input%2==1) {
				//홀수일때
				odd++;
			}else {  //나머지가 ==0 , 짝수
				even++;
			}
			sum+=input;
		}
		System.out.println("누적 결과 : " + sum);
		System.out.println("홀수 개수 : "+odd);
		System.out.println("짝수 개수 : "+even);
		
	}

}
