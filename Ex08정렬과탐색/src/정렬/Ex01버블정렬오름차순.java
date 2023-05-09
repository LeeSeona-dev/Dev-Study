package 정렬;

import java.util.Arrays;

public class Ex01버블정렬오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {10,65,54,87,32,12,8,32,};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		int temp;// 치환을 위한 임시공간!
		
		//1회차
		//0 -1 비교 -> 1 -2 비교 -> 2-3 비교 ->3-4 비교 -> 4-5비교 ->5-6비교->6-7비교
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(1+"회차 : "+Arrays.toString(arr));
		//2회차
		//0-1비교->1-2비교->2-3비교->3-4비교->4-5비교->5-6비교
		for(int i =0; i<arr.length-2; i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(2+"회차 : "+Arrays.toString(arr));
		System.out.println();
		
		//반복문으로 !!
		//중간에 정렬이 완료된 경우 정렬 진행 x
		boolean sw = false; //n회차 정렬이 한번이라도 일어나면 true
		for(int j =0; j<arr.length-1; j++) {	//7회차까지
			sw = false;
			for(int i =0; i<arr.length-1-j; i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sw = true;
				}
			}
			if(!sw) {	//sw = false일때만 수행(n회차 한번도 바뀌지 않았을때!)
				break;
			}
			System.out.println(j+1+"회차 : "+Arrays.toString(arr));
		}

	}

}
