package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {
		
		
		//int[] arr = {3, 7, 10, 22, 24, 42, 43, 68, 82, 84};
		//선택 _오름차순
		int[] arr = {10,24,7,68,42,82,3,43,22,84};
		
		//1.치환
		int temp;
		//2. 가장 작은 값을 가진 인덱스 값이 저장될 변수
		int index;
		for(int i =0; i<arr.length-1; i++) {
			index = i;
			
			for(int j = i; j<arr.length; j++) {
				if(arr[index]>arr[1]) {
					index = j;
				}
			}
			//치환 -> 제일 작은 값을 0번 인덱스로 보내자, 두번째 ->1번 인덱스
			if(i!=index) {
				//원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를때만
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;	//0번 인덱스에 가장 작은 값이 들어온 상태
			}
		}
		//오름차순으로 정렬된 상태
		//이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어 있어야 한다!
		
		
		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		int num = 68;
		
		while(true) {
			
			// middleIndex 초기화
			int middleIndex = ( lowIndex + highIndex)/2;
			// 현재 보고있는 배열 구역의 센터 인덱스 값을 초기화
			// middle에 있는 데이터랑 num이랑 같은지 판단
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else {
				//arr[m] != num -> arr[m]보다 작은지, 큰지를 판단한 다음
				// lowIndex값과 , highIndex값을 다시 설정
				if(arr[middleIndex]>num) {
					highIndex = middleIndex -1;
				}else {
					//arr[m]<num
					lowIndex = middleIndex+1;
				}
			}
		}
	}
}
