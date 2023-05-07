import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1.크기가 5인 정수형 데이터를 저장 할 수 있는 배열 생성
		// -> 생성 후 그 배열의 참조값을 저장할 레퍼런스 변수 선언
		int[] arr = new int[5];
		
		int max = 0;	//int max = arr[0];
		int min = 100;  //int min = arr[0];
		int sum = 0;	//누적합
		int avg = 0;	//평균 구하는 변수
		
		
		//일반 for문
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(i+1+"번 째 입력 >>");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			avg = sum/arr.length;
			
		} System.out.print("입력된 점수 : ");
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//확장 for문(for~each문)
		//: 배열 , List 구조에서 쓰일 수 있는 반복문
		//for(배열의 0번인덱스에 있는 값부터 임시로 저장할 변수:배열의 레퍼런스변수이름)
		
//		for(int a:arr) {
//			if(max<a) {
//				max = a;
//			}
//			if(min>a) {
//				min = a;
//			}
//			
//		}System.out.print(a+" ");
//		System.out.println(" 최고점수 : "+max);
//		System.out.println(" 최저점수 : "+min);
		
		System.out.println("\n최고 점수: "+max);
		System.out.println("최저 점수: "+min);
		System.out.println("총 합 : "+sum);
		System.out.println("평균 : "+(double)avg);
		System.out.printf(" 평균 : %.2f",sum/(double)arr.length);

	}

}
