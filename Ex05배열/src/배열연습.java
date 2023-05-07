import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		//1.5개 입력한 답을 저장 할 수 있는 배열 생성
		// -> 생성 후 그 배열의 참조값을 저장할 레퍼런스 변수 선언
		int[] arrScore = new int[5];
		int[] arrScore2= {1,4,3,2,1};
		//점수 세는 변수
		int sum=0;
		
		//답 입력하기
		for(int i =0 ; i<arrScore.length; i++) {
			System.out.print(i+1+"번답 >>");
			arrScore[i]=sc.nextInt();
		}//System.out.print("입력한 답은 : ");
		//for(int i = 0; i<arrScore.length; i++) { //1. 입력한 답 확인
			//System.out.print(arrScore[i]+" ");
			
		//}
		
		//정답 확인하기
		System.out.println("정답확인");
		for(int i = 0; i<arrScore2.length; i++) {
			if(arrScore[i]==arrScore2[i]) {
				sum+=20;
				System.out.print("O"+" ");
			}else {
				System.out.print("X"+" ");
			}
		} System.out.print("총 점 : "+sum);
		
		
	}

}
