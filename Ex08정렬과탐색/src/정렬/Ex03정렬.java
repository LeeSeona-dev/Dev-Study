package 정렬;

import java.util.Arrays;

public class Ex03정렬 {

	public static void main(String[] args) {
		
		int[] arr = {10,65,54,87,32,12,8,32,};
		
		//Arrays : 배열을 다룰 수 있는 속성, 메서드의 모음->클래스 (사용을한다) ->객체(도구)
		Arrays.sort(arr); //호출만, arr 배열안에 값을 정렬해서 저장
		System.out.println(Arrays.toString(arr));
		
		
	}

}
