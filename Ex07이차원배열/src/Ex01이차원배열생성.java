
public class Ex01이차원배열생성 {

	public static void main(String[] args) {


		int[][] arr = new int[3][5];	//배열 생성시 크기 무조건 지정
		//1차원배열 3개 -> 5칸(길이5)
		//레퍼런스 배열 무조건 1개 -> 길이 3
		//-> 3행 5열 행렬 구조
		//int형 배열 -> 초기화를 하지않으면 기본 0 가지고있음
		
		arr[0][0] =10;
		//레퍼런스 배열 초기화는 불가능(참조값을 가지고있기 때문) arr[0]=1; XX
		System.out.println(arr[0][0]);
		
		char[][] charArr = {{'a','b','c'},{'d','e','f'}};
		System.out.println(charArr.length);//2-> 레퍼런스 배열의 길이를 출력
										//일차원배열이 몇개 ? -> 2개		
		System.out.println(charArr[0].length);//3->일차원 배열의 길이
		
		int [][] arr2 = new int[5][5];
		
		//
		int num=1;
		
		for(int j = 0; j<arr2.length; j++) {	//1차원배열 하나 초기화를 반복	
			for(int i=0; i<arr2[j].length; i++) { //1차원배열 하나 초기화
				arr2[j][i] = num++; 
			}
		}
		//바깥쪽 for문은 레퍼런스 배열 length로!!! -> 1개의 행을 다룸
		//안쪽 for문은 j번째 length로	->1개의 행 안의 각 실제 데이터을 다룸
		
		for(int j = 0; j<arr2.length; j++) {	//1차원배열 하나 초기화를 반복	
			for(int i=0; i<arr2[j].length; i++) { //1차원배열 하나 초기화
				System.out.print(arr2[j][i]+"\t ");
			}System.out.println();
		}
		
		//4행 6열
		int[][] arr3 = new int[4][6];
		// i -> j -> k 순서 일반적 중첩 for문
		
		int num1 = 21;
		for(int i = 0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = num1++;
			}
		}
		
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+ "\t");
			}System.out.println();
		}
		
		System.out.println();
		//5행 5열 5 4 3 2 1 , 10 9 8 7 6...
		
		int[][] arr4 = new int[5][5];
		
		
		int num2 = 5;
		for(int i = 0; i<arr4.length; i++) {
			
			for(int j=0; j<arr4[i].length; j++) {
				arr4[i][j] = num2--;
			}
			num2+=10;
		}
		//출력
		for(int i = 0; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j]+ "\t");
			}System.out.println();
		}
		
		//배열 생성, 레퍼런스 변수 선언
		int[][] arr5 = new int[4][6];
		//21~ 숫자로 배열 초기화
		int num3 = 21;
		for(int i = 0; i<arr5.length; i++ ) {	// 총 4개의 1차원 배열을 다룰 수 있도록함
			for(int j =0; j<arr5[i].length; j++) {	//1개의 1차원 배열을 다룰 수 있음
				arr5[i][j] = num++;
			}
		}
		//출력
		for(int i = 0; i<arr5.length; i++ ) {	// 총 4개의 1차원 배열을 다룰 수 있도록함
			for(int j =0; j<arr5[i].length; j++) {	//1개의 1차원 배열을 다룰 수 있음
				System.out.print(arr5[i][j]+"\t");
			}System.out.println();
		}
		
	}	
}
