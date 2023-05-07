

public class Ex01while문 {

	public static void main(String[] args) {
		//while문
		//1~5까지 출력
		//반복문 
		//1. while (do~while) : 특정 조건에 해당 할 경우에만 반복(반복횟수가 정확하지 않은 경우)
		//2. for : 반복횟수가 정해진 경우
		//while({문장}을 반복 할 조건)
		
		//변수 선언 후 초기화 보통은 0,1로 초기화
		int num = 1;
		while(num<6) {
			//반복하고 싶은 문장
			
			System.out.println(num);  //변수 사용(값이 바뀌어야 하니까!!) //출력
			num++; //1증가
			
		}
		//지역변수 : 특정 구역에서만 사용 가능한 값 (어디까지만 사용가능한지)
		//전역변수 : 어디에서든 사용 가능한 값
		
		//alt+shift+r :변수 이름 일괄 수정!!!
		int num1 = 1;
		while(num1<=5) {
			
			System.out.println(num1++);  
			//++num1; //1증가
			
		}
		
		
		int num11 = 0;
		while(true) {    //반복을 그만할 조건  //무조건 반복만 하게!! (무한반복)
			
			  
			//++num1; //1증가
			//반복문을 나갈 조건 추가
			if(num11==6) {  //반복문 나갈거니?
				//반복문 나가기
				break;  //switch , 반복문(while , for) 나가게 하는 키워드
						// -> break를 기준으로 가장 가까운 반복문만 나감!!
			}
			System.out.println(num11++);  
		}
		
		//do~while문 : 반복문장을 무조건 1번은 실행 해야 할 때! 
		int num3=1;
		
		do {
			System.out.println(num3++);
			
		}while(num3<=5);
		
	}

}
