
public class Ex03배열 {

	public static void main(String[] args) {
		// 1. 크기가 10인 배열 생성 후 원하는 값으로 초기화
		int[] arr= {10,25,34,2,59,67,45,66,24,30};
		
		
		//2. 배열의 값 중 홀수만 출력, 홀수가 몇개인지 출력
		
		int cnt=0; //홀수 개수 카운트
		
		System.out.print("배열 홀수 : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				++cnt;
				System.out.print(arr[i]+" ");
			}
		}System.out.println("\n총 개수 : " + cnt+ "개");

	}

}
