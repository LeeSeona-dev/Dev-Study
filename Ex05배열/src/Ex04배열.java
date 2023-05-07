
import java.util.Arrays;
import java.util.Random;

public class Ex04배열 {

	public static void main(String[] args) {

		// 랜덤 객체
		// rd = 레퍼런스 변수

		Random rd = new Random();

		// 배열을 랜덤값 초기화
		int[] arr = new int[10]; //정수 배열 선언 기본값=0
								//0 0 0 0 0 0 0 0 0 0 0

		int min = 20; //가장 작은 숫자만 저장 !!0보다 작은 수는 없으므로 큰 수로 할당
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
			System.out.print(arr[i] + " ");
			System.out.println(Arrays.toString(arr));
			
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}

		}System.out.println("\n가장 큰 값: " +max);
		System.out.println("가장 작은 값: "+min);
		
		//Arrays(도구,객체)가 가지고 있는 toString 메서드 호출
		//toString 반환타입 ->string

	}

}
