package 정렬;

import java.util.Arrays;

public class Ex02선택정렬오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {87,65,21,35,15};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
//		int temp;
//		//1회차
//		int index = 0;
//		for(int i =index+1; i<5; i++) {
//			if(arr[index] > arr[i]) {
//				index = i;//index:배열안에서 가장 작은 값이 존재하는 인덱스 번호를 가지고 있음
//			}
//		}
//		temp = arr[0];
//		arr[0] = arr[index];	//가장 작은 숫자 -> 0
//		arr[index] = temp;	//원래 0번에 있던 값을 index 로 옮기기!
//		
//		System.out.println(1+"회차 : "+Arrays.toString(arr));
//		
//		//2회차
//		index =1;
//		for(int i = index+1; i<5; i++) {
//			if(arr[index]>arr[i]) {
//				index = i;	//두번째로 작은숫자가 존재하는 인덱스번호
//			}
//		}
//		temp = arr[1];
//		arr[1] = arr[index];
//		arr[index] = temp;
//		System.out.println(2+"회차 : "+Arrays.toString(arr));
//		
//		System.out.println();
		
		//반복문으로!
		int temp;	//치환 시 사용
		int index;	//내가 지금까지 본 숫자중 가장 작은 수의 인덱스 번호 기억하는 변수
		for(int j = 0; j<arr.length-1; j++) {//회차 의미, 숫자 5개므로 4회차까지
			index = j;	//1회차0, 2회차 1, 3회차2, 4회차 3
			for(int i = index+1; i<arr.length; i++) {	
				if(arr[index]>arr[i]) {	//내림차순일경우 부등호 방향만 <으로 바꿈!!!
					index = i;	
				}
			}
			temp = arr[j];	
			arr[j] = arr[index];
			arr[index] = temp;
			System.out.println(j+1+"회차 : "+Arrays.toString(arr));
		}
	}

}
